package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Account;


@Repository
public interface AccountDao extends JpaRepository<Account, Integer>{
	
	Account save(Account a);
	List<Account> findByAccId(int accId);
	@Modifying
	@Query(value = "update Account set balance = balance - ?1 where acc_id=?2",nativeQuery = true)
	int withdrawl(int amount,int accId);
	@Modifying
	@Query(value = "update account set balance = balance + ?1 where acc_id=?2", nativeQuery = true)
	int deposit(int amount, int accId);
	List<Account> findByAccNo(int accNo);
	@Query(value = "select * from account where name like ?%",nativeQuery = true)
	List<Account> findByAccNameStartsWith(String Name);
	@Query(value = "select * from account where name=?", nativeQuery = true)
	List<Account> findByAccHolderName(String accHolderName);
	@Query(value = "select * from account where name like %?",nativeQuery = true)
	List<Account> findByAccNameEndsWith(String Name);
	
}
