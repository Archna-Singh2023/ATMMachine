package com.atm.basic.service;

import com.atm.basic.dao.CustomerDao;
import com.atm.basic.dao.CustomerDaoImpl;
import com.atm.basic.entity.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao = new CustomerDaoImpl();
	}

	@Override
	public Customer findCardNo(String cardNo) {
		
		return customerDao.findCardNo(cardNo);
	}

	@Override
	public Boolean findPinNo(String cardNo, Integer cardPin) {
		
		
		return customerDao.findPinNo(cardNo, cardPin);
	}

//	@Override
//	public Boolean findPinNo(String pinNo) {
//		
//		return customerDao.findPinNo(pinNo);
//	}

}
