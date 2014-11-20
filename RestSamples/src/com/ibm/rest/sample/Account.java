package com.ibm.rest.sample;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account{


      int id;
      String accountType;
      String description;
      String currency;
      double balance;

      // For JAXB Serialization to work every class must have a
      // default no-arg constructor
      // if there are any other constructors defined!
      public Account() {
      }

      public Account(int i, String name, String type, double balance) {
            setId(i);
            setDescription(name);
            setAccountType(type);
            setBalance(balance);
            setCurrency("USD");
      }

      
      public int getIdValue() {
    	  return id;
      }
      
      @XmlElement
      public int getId() {
            return id;
      }

      public void setId(int id) {
            this.id = id;
      }

      @XmlElement(name="name")
      public String getDescription() {
            return description;
      }

      public void setDescription(String description) {
            this.description = description;
      }

      @XmlElement(name="type")
      public String getAccountType() {
            return accountType;
      }

      public void setAccountType(String accountType) {
            this.accountType = accountType;
      }

      @XmlElement
      public String getCurrency() {
            return currency;
      }

      public void setCurrency(String currency) {
            this.currency = currency;
      }

      @XmlElement
      public double getBalance() {
            return balance;
      }

      public void setBalance(double balance) {
            this.balance = balance;
      }
}

