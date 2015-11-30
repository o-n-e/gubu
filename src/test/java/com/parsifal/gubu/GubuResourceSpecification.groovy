package com.parsifal.gubu;

import com.mongodb.MongoClient
import org.bson.types.ObjectId
import spock.lang.Ignore
import spock.lang.Specification

import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.Response

class GubuResourceSpecification extends Specification {
    //functional test
    def 'should save all fields to the database when moment is saved'() {
        given:
        def mongoClient = new MongoClient()
        def database = mongoClient.getDB("Gubu")
        def collection = database.getCollection('Moment')
        collection.drop();

        def gubu = new GubuResource(mongoClient)

        def moment = new Moment()
        moment.with {
            date = 1
            month = 'August'
            year = 1999
            hour = 18
            minute = 25
            userId = 1
            bolus = 15
            entryType = "Before Breakfast"
        }

        when:
        Response response = gubu.saveMoment(moment);

        then:
        collection.count == 1
        def createdMoment= collection.findOne()

        createdMoment['date'] == moment.date
        createdMoment['month'] == moment.month
        createdMoment['year'] == moment.year
        createdMoment['hour'] == moment.hour
        createdMoment['minute'] == moment.minute

        createdMoment['_id'] != null
        createdMoment['prettyString'] == null

        cleanup:
        mongoClient.close()
    }

    //functional test
    @Ignore('Not implemented yet')
    def 'should throw a 404 if the order is not found'() {
        given:
        def mongoClient = new MongoClient()
        def database = mongoClient.getDB("Gubu")
        def gubu = new GubuResource(mongoClient)

        when:
        gubu.getMoment(7474, new ObjectId().toString());

        then:
        def e = thrown(WebApplicationException)
        e.response.status == 404

        cleanup:
        mongoClient.close()
    }
}