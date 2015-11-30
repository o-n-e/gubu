package com.parsifal.gubu;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/gubu")
@Produces(MediaType.APPLICATION_JSON)
public class GubuResource {

    private Datastore dataStore;

    public GubuResource(MongoClient mongoClient) {
        dataStore = new Morphia().createDatastore(mongoClient, "Gubu");
    }

    @Path("moment")
    @POST()
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveMoment(Moment moment) {

        dataStore.save(moment);
        return Response.created(URI.create(moment.getId())).entity(moment).build();
    }

}
