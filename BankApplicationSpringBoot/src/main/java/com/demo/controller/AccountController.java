package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Account;
import com.demo.service.AccountService;

@RestController
@RequestMapping(value = "/BankAccount")
public class AccountController {
	
	@Autowired
	private AccountService service;
	
	@PostMapping("/saveDetails")
	public Account save(@RequestBody Account a) {
		return service.save(a);
	}
	
	@GetMapping(value = "/FindAccountById/{sid}")
	public List<Account> find(@PathVariable int sid) {
		return service.findByAccId(sid);
	}
	
	@PutMapping(value = "/updateAmount/withdrawl/{amount}/{accId}")
	public int withdrawl(@PathVariable int amount, @PathVariable int accId) {
		return service.withdrawl(amount, accId);
	}
	
	@PutMapping(value = "/updateAmount/deposit/{amount}/{accId}")
	public int deposit(@PathVariable int amount, @PathVariable int accId) {
		return service.deposit(amount, accId);
	}
	
	@GetMapping(value = "/FindByAccountNo/{accNo}")
	public List<Account> findByAccno(@PathVariable int accNo) {
		return service.findByAccNo(accNo);
	}
	
	@GetMapping(value = "/findByAccountHolderNameStartsWith/{accHolderName}")
	public List<Account> findByNameStarting(@PathVariable String accHolderName){
		return service.findByAccNameStartsWith(accHolderName);
	}
	
	@GetMapping(value = "/findByAccountHolderName/{Name}")
	public List<Account> findByName(@PathVariable String Name){
		return service.findByAccHolderName(Name);
	}

	@GetMapping(value = "/findByAccountHolderNameEndsWith/{accHolderName}")
	public List<Account> findByNameEnding(@PathVariable String accHolderName){
		return service.findByAccNameEndsWith(accHolderName);
	}
	
	@PutMapping(value = "/updateBankDetails")
	public Account updateDetails(@RequestBody Account a) {
		return service.save(a);
	}
	
	
	
	
}
