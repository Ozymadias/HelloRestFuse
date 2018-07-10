package com.app.fuse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class Service {

    public Service() {}

    @GET
    @Path("/{name}")
    public String getCustomer(@PathParam("name") String name) {
        return null;
    }
}
