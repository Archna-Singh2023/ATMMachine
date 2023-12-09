package com.atm.basic.dao;

import com.atm.basic.entity.Customer;

public interface CustomerDao {
	
	Customer findCardNo(String cardNo);
	Boolean findPinNo(String cardNo, Integer cardPin);

}
