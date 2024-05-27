package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.AccountDao;
import com.demo.model.Account;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao accountDao;
	
	@Override
	public Account save(Account a) {
		return accountDao.save(a);
	}

	@Override
	public List<Account> findByAccId(int accId) {
		return accountDao.findByAccId(accId);
	}

	@Override
	public int withdrawl(int amount, int accId) {
		return accountDao.withdrawl(amount, accId);
	}

	@Override
	public int deposit(int amount, int accId) {
		return accountDao.deposit(amount, accId);
	}

	@Override
	public List<Account> findByAccNo(int accNo) {
		return accountDao.findByAccNo(accNo);
	}

	@Override
	public List<Account> findByAccNameStartsWith(String accHolderName) {
		return accountDao.findByAccNameStartsWith(accHolderName);
	}

	@Override
	public List<Account> findByAccHolderName(String accHolderName) {
		return accountDao.findByAccHolderName(accHolderName);
	}

	@Override
	public List<Account> findByAccNameEndsWith(String Name) {
		return accountDao.findByAccNameEndsWith(Name);
	}

	

}
