package com.pns.bank.service;

import java.util.List;

import com.pns.bank.model.Transction;

public interface TransctionServiceI {

	public Transction getById(long transaction_Id);

	public Transction addAmount(Transction transction);
	
	public List<Transction>getAllTransction();
}
