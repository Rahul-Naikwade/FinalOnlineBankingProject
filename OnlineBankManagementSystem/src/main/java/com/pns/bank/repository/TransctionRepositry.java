package com.pns.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pns.bank.model.Transction;

@Repository
public interface TransctionRepositry extends JpaRepository<Transction, Long> {

	public Transction findById(long transaction_Id);
}
