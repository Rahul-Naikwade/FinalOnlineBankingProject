package com.pns.bank.model;


import java.security.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;

@Entity
public class Transction {

	@Id
	private long transaction_Id;
	private double transaction_amount;
	//private Timestamp transaction_Datetime;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@OneToOne(cascade = CascadeType.ALL)
	private Account account;

	public long getTransaction_Id() {
		return transaction_Id;
	}

	public void setTransaction_Id(long transaction_Id) {
		this.transaction_Id = transaction_Id;
	}

	public double getTransaction_Amount() {
		return transaction_amount;
	}

	public void setTransaction_Amount(double transaction_Amount) {
		this.transaction_amount = transaction_Amount;
	}

	/*
	 * public Timestamp getTransaction_Datetime() { return transaction_Datetime; }
	 * 
	 * public void setTransaction_Datetime(Timestamp transaction_Datetime) {
	 * this.transaction_Datetime = transaction_Datetime; }
	 */
}
