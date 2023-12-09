package com.atm.basic.presentation;

import com.atm.basic.entity.Customer;

public interface AtmApp {

	void deposit(Customer customer);
	void withdrawal(Customer customer);
	void showBalance(Customer customer);
	void changePin(Customer customer);
	void miniStatement(Customer customer);
	
}
