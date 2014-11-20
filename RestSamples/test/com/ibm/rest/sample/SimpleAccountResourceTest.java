package com.ibm.rest.sample;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

public class SimpleAccountResourceTest {

      @Test
      public void testGetAccounts() {
            String address = "http://localhost:9080/RestServicesSamples/banking/simple/accounts";
            StringBuffer result = new StringBuffer();
            String expectedResult = "<accounts><account>123</account>"+
                        "<account>234</account></accounts>";
            try {

                  fetchResult(address,result);
            } catch (MalformedURLException e) {
                  e.printStackTrace();
                  fail("MalformedURLException caught");
            } catch (IOException e) {
                  e.printStackTrace();
                  fail("IOException caught");
            }
            assertEquals(expectedResult, result.toString());
      }


      private void fetchResult(String address,StringBuffer result) throws MalformedURLException,IOException
            {
            URL url;
            url = new URL(address);
            URLConnection conn = url.openConnection();
            BufferedReader in = new BufferedReader(new
            InputStreamReader(
                        conn.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                  result.append(inputLine);
            in.close();
      }

}