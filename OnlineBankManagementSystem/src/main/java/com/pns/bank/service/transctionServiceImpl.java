package com.pns.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pns.bank.model.Transction;

import com.pns.bank.repository.TransctionRepositry;

@Service
public class transctionServiceImpl implements TransctionServiceI {
	@Autowired
	private TransctionRepositry tr;

	@Override
	public Transction addAmount(Transction Transction) {
		return tr.save(Transction);

	}

	@Override
	public Transction getById(long transaction_Id) {
		return tr.findById(transaction_Id);

	}

	@Override
	public List<Transction> getAllTransction() {
		List<Transction> tlist = tr.findAll();
		return tlist;
	}

}
