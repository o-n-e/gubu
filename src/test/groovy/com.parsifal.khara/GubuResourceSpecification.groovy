package com.parsifal.khara;

import com.mongodb.MongoClient
import org.bson.types.ObjectId
import spock.lang.Ignore
import spock.lang.Specification

import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.Response

class GubuResourceSpecification extends Specification {
    //functional test
    /*
    def 'should save all fields to the database when moment is saved'() {
        given:
        def mongoClient = new MongoClient()
        def database = mongoClient.getDB("Gubu")
        def collection = database.getCollection('Moment')
        collection.drop();

        def gubu = new GubuResource(mongoClient)

        def moment = new Moment()
        moment.with {

        }

        def order = new Order()
        order.with {
            date = 15

            drinker = 'Me'
            type = drinkType
            selectedOptions = ['soy milk']
            coffeeShopId = 89438
        }

        when:
        Response response = gubu.saveMoment(moment);

        then:
        collection.count == 1
        def createdOrder = collection.findOne()
        createdOrder['selectedOptions'] == order.selectedOptions
        createdOrder['type'].name == order.type.name
        createdOrder['type'].family == order.type.family
        createdOrder['size'] == order.size
        createdOrder['drinker'] == order.drinker
        createdOrder['coffeeShopId'] == order.coffeeShopId
        createdOrder['_id'] != null
        createdOrder['prettyString'] == null

        cleanup:
        mongoClient.close()
    }
    */
}