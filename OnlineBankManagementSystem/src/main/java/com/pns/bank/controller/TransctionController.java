package com.pns.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pns.bank.model.Transction;
import com.pns.bank.service.TransctionServiceI;

@RestController
public class TransctionController {

	@Autowired
	private TransctionServiceI Si;

	@PostMapping("/addTransction")
	public Transction addAmount(@RequestBody Transction transction) {
		return Si.addAmount(transction);

	}

	@GetMapping("/getById/{transaction_Id}")
	public Transction getById(@PathVariable long transaction_Id) {
		return Si.getById(transaction_Id);

	}

	@GetMapping("/GetAll")
	public List<Transction> getAllTransction() {
		List<Transction> tlist = Si.getAllTransction();

		return tlist;

	}

}
