package com.atm.basic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.atm.basic.entity.Customer;

public class CustomerDaoImpl  implements CustomerDao{
	 EntityManager entityManager = MyConnection.getEntityManagerObject();

	@Override
	public Customer findCardNo(String cardNo) {
		
		Customer cust = null;
		
		String jpql = "select c from Customer c where c.atmCard.cardNo = ?1" ;
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, cardNo);
		List<Customer> l = query.getResultList();
		if(!l.isEmpty()) {
			cust = l.get(0);
		}
		return cust;
		
	}

	@Override
	public Boolean findPinNo(String cardNo, Integer cardPin) {
		
		String jpql = "select c from Customer c where c.atmCard.cardNo=?1 and c.atmCard.cardPin=?2";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, cardNo);
		query.setParameter(2, cardPin);
		List<Customer> l = query.getResultList();
		if(!(l.isEmpty())) {
		      return true;   
		}
		else {
			return false;
		}

		
	}

}
