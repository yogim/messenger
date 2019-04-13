package com.ymhase.rest.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/matrix")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class MatrxDemo {
    
    
    @GET
    @Path("name")
    public String getMessage(@MatrixParam("name") int name) {

	return "Hi, you sent me " + name;
    }

}
