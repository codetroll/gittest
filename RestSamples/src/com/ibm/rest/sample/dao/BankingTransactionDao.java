package com.ibm.rest.sample.dao;

import java.util.HashMap;

import com.ibm.rest.sample.BankingTransaction;

public class BankingTransactionDao {

      static BankingTransactionDao instance = new BankingTransactionDao();

      public static BankingTransactionDao getInstance() {
            return instance;
      }

      HashMap<String, BankingTransaction> accounts =
              new HashMap<String, BankingTransaction>();
      int lastId=123;

      public BankingTransactionDao() {
            String key=deriveKey(123,123);
            BankingTransaction aTrans = new BankingTransaction("123", 1388249396976L,"USD", "paycheck", 110.0, "DEPOSIT", "DIRECT");
            accounts.put(key, aTrans);
      }
      private String deriveKey(int account, int id) {
            StringBuffer buf = new StringBuffer();
            buf.append(account);
            buf.append("-");
            buf.append(id);
            String key = buf.toString();
            return key;
      }

      public BankingTransaction getTransaction(int account, int id){
            String key = deriveKey(account, id);
            return (BankingTransaction)accounts.get(key);
      }

      public int putTransaction(int account, BankingTransaction aTrans)
      {
            int id=getNextID();
            String key = deriveKey(account,id);
            aTrans.setId(Integer.toString(id));
            accounts.put(key, aTrans);
            return id;
      }

      private int getNextID() {
            return ++lastId;
      }
}