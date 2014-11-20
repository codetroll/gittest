package com.ibm.rest.sample;


import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BankingTransaction {
      @XmlElement
      protected String id;
      @XmlElement
      protected Date date;
      @XmlElement
      protected double amount;
      @XmlElement
      protected String currency;
      @XmlElement
      protected String merchant;
      @XmlElement(name="memo")
      protected String description;
      @XmlElement

      protected String tranType;

      public BankingTransaction() {
      }

      public BankingTransaction(String id, long date,String currency, String memo, double amount, String tranType, String merchant) {
            setId(id);
            setDescription(memo);
            setAmount(amount);
            setCurrency(currency);
            setTranType(tranType);
            setMerchant(merchant);
            setDate(new Date(date));
      }
      public String getDescription() {
            return description;
      }
      public void setDescription(String aDescription) {
            description = aDescription;
      }
      public double getAmount() {
            return amount;
      }
      public void setAmount(double anAmount) {
            amount = anAmount;
      }
      public String getCurrency() {
            return currency;
      }
      public void setCurrency(String currency) {
            this.currency = currency;
      }
      public String getId() {
            return id;
      }
      public void setId(String id) {
            this.id = id;
      }
      public String getTranType() {
            return tranType;
      }
      public void setTranType(String tranType) {
            this.tranType = tranType;
      }
      public String getMerchant() {
            return merchant;
      }
      public void setMerchant(String merchant) {
            this.merchant = merchant;
      }
      public Date getDate() {
            return date;
      }
      public void setDate(Date date) {
            this.date = date;
      }
}