package com.edmunds.carcode.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Temporary service for testing purposes.
 */
@Path("api/carcode")
public class PingdomService {

    @GET
    @Path("/pingdom")
    public Response getMsg() {
        String output = "Ok";
        return Response.status(200).entity(output).build();
 
    }

}
