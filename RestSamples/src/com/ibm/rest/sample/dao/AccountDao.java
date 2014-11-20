package com.ibm.rest.sample.dao;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.rest.sample.Account;

public class AccountDao {
	HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	
	private static Logger log = LoggerFactory.getLogger(AccountDao.class);
	private Connection bat1Connection = null;


	public AccountDao() {
		Account anAccount = new Account(123, "Account one", "savings", 110.0);
		accounts.put(anAccount.getIdValue(), anAccount);
		anAccount = new Account(124, "Account twp", "savings", 220.0);
		accounts.put(anAccount.getIdValue(), anAccount);
	}

	public List<Account> getAccounts() {
		List<Account> accountslist = new Vector<Account>();
		accountslist.addAll(accounts.values());
		return accountslist;
	}

	public Account get(int id) {
		return (Account) accounts.get(id);
	}
}
