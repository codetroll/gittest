package com.ibm.rest.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Greeting")
public class GreetingResource {
@GET
      public String getMessage() {
            return "Hello World 2";
      }
}