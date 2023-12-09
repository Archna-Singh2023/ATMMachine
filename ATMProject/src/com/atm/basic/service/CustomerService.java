package com.atm.basic.service;

import com.atm.basic.entity.Customer;

public interface CustomerService {
	
	Customer findCardNo(String cardNo);
	Boolean findPinNo(String cardNo, Integer cardPin);

}
