package com.ibm.rest.sample;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/simple/accounts")
public class SimpleAccountResource {
      @GET
      @Produces("application/xml")
     public String getAccounts() {
           return "<accounts><account>123</account>"+
                        "<account>234</account></accounts>";
      }
      @Path("{id}")
      @GET
      @Produces("application/xml")
      public String getAccount(@PathParam(value="id") int accountId){
            if (accountId==123)
                  return "<account><id>123</id>" +
                              "<description>Savings</description>" +
                              "<balance>110.00</balance></account>";
            else
                  return "<error>No account having that id</error>";
      }
}