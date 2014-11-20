package com.ibm.rest.sample;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/banking/*")
public class BankingApplication extends Application {

}

