package com.atm.basic.service;

import java.time.LocalDate;
import java.util.List;

import com.atm.basic.entity.Customer;
import com.atm.basic.entity.Transaction;

public interface AtmCardService {
	
	String deposit(Customer customer, Integer depositAmount);
	String withdrawal(Customer customer, Integer withdrawAmount);
	Double showBalance(Customer customer);
	String changePin(Customer customer, Integer cardPin);
	List<Transaction> miniStatement(Customer customer);
	void updateCardStatus(String cardNo, String cardStatus);
	Integer checkTransactionCount(Integer accountNo, String transactionType , LocalDate transactionDate);


}
