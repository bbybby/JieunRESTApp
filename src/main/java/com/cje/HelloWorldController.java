package com.cje;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

/**
 * Created by bbybby on 12/13/16.
 */

@Path("/hello")
public class HelloWorldController {

    @GET
    @Path("/{msg}")
    public Response showMessage(@PathParam("msg") String m) {
        String outmsg = "Received message : " + m;

        return Response.status(Response.Status.OK).entity(outmsg).build();
    }
}