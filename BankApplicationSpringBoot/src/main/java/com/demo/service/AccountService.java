package com.demo.service;

import java.util.List;

import com.demo.model.Account;

public interface AccountService {
	Account save(Account a);
	List<Account> findByAccId(int accId);
	int withdrawl(int amount,int accId);
	int deposit(int amount, int accId);
	List<Account> findByAccNo(int accNo);
	List<Account> findByAccNameStartsWith(String Name);
	List<Account> findByAccHolderName(String accHolderName);
	List<Account> findByAccNameEndsWith(String Name);
}
