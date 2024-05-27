package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "acc_id")
	private int accId;
	@Column(unique = true, name = "acc_no")
	private int accNo;
	private String Name;
	@Column(name = "IFSC")
	private String IFSC;
	@Column(columnDefinition = "double(10,2)")
	private double balance;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return Name;
	}
	public void setAccHolderName(String Name) {
		this.Name = Name;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String IFSC) {
		this.IFSC = IFSC;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountInfo [accId=" + accId + ", accNo=" + accNo + ", accHolderName=" + Name + ", IFSC="
				+ IFSC + ", balance=" + balance + "]";
	}
	
}
