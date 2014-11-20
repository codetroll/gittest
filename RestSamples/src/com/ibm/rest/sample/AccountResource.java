package com.ibm.rest.sample;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ibm.rest.sample.dao.AccountDao;
import com.ibm.rest.sample.dao.BankingTransactionDao;


@Path("/accounts")
public class AccountResource {
      AccountDao dao = new AccountDao();
      BankingTransactionDao txnDao = BankingTransactionDao.getInstance();
      
      public AccountResource() {
      }
      @GET
      @Produces(MediaType.APPLICATION_XML)
      public List<Account> getAccounts() {
            return dao.getAccounts();
      }
      
      
      @GET
      @Path("/{id}")
      @Produces(MediaType.APPLICATION_XML)
      public Response getAccount(@PathParam(value="id") int id){
            Account value = dao.get(id);
            if (value != null)
                  return Response.ok(value).build();
            else
                  return Response.status(404).build();
      }
      
      
      
      @Path("{account}/transaction")
      @Consumes(MediaType.APPLICATION_JSON)
      @Produces(MediaType.APPLICATION_JSON)
      @POST
      public int putTransaction(@PathParam(value="account") int account,
                                BankingTransaction aTrans){
          return txnDao.putTransaction(account, aTrans);
      }
      
      
      @Path("{account}/transaction/{id}")
      @Produces(MediaType.APPLICATION_JSON+ ","+MediaType.APPLICATION_XML)
      @GET
      public BankingTransaction getTransaction(@PathParam(value="account") int account,@PathParam(value="id") int id){
            BankingTransaction aTrans = txnDao.getTransaction(account, id);
            return aTrans;
      }
      
      
}