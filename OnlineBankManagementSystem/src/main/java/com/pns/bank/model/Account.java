package com.pns.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	private int account_Id;
	private long account_No;


	public long getAccount_Id() {
		return account_Id;
	}

	public void setAccount_Id(int account_Id) {
		this.account_Id = account_Id;
	}

	public long getAccount_No() {
		return account_No;
	}

	public void setAccount_No(long account_No) {
		this.account_No = account_No;
	}

	
}
