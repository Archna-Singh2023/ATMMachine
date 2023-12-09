package com.atm.basic.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.atm.basic.entity.AtmCard;
import com.atm.basic.entity.Customer;
import com.atm.basic.entity.Transaction;

public class AtmCardDaoImpl implements AtmCardDao{
	
	EntityManager entityManager =  MyConnection.getEntityManagerObject();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public String deposit(Customer customer, Integer depositAmount) {
		
		entityTransaction.begin();
		customer.getAccount().setBalance(customer.getAccount().getBalance()+depositAmount);
		Transaction transaction = new Transaction();
		transaction.setAccountNo(customer.getAccount().getAccountNo());
		transaction.setTransactionDate(LocalDate.now());
		transaction.setTransactionTime(LocalTime.now());
		transaction.setTransactionType("Cr");
		transaction.setAmount(depositAmount);
		
		entityManager.persist(transaction);
		entityTransaction.commit();
		
		return "     Amount deposited successfully.....";
	}

	@Override
	public String withdrawal(Customer customer, Integer withdrawAmount) {
		
		entityTransaction.begin();
		customer.getAccount().setBalance(customer.getAccount().getBalance()-withdrawAmount);
		Transaction transaction = new Transaction();
		transaction.setAccountNo(customer.getAccount().getAccountNo());
		transaction.setTransactionDate(LocalDate.now());
		transaction.setTransactionTime(LocalTime.now());
		transaction.setTransactionType("Dr");
		transaction.setAmount(withdrawAmount);
		
		entityManager.persist(transaction);
		entityTransaction.commit();
		return "         Amount withdrawal successfully......";
	}

	@Override
	public Double showBalance(Customer customer) {
	 customer = entityManager.find(Customer.class, customer.getCustomerId());
		return customer.getAccount().getBalance();
	}

	@Override
	public String changePin(Customer customer, Integer cardPin) {
		AtmCard atmCard = customer.getAtmCard();
		
		entityTransaction.begin();
		atmCard.setCardPin(cardPin);
		entityTransaction.commit();
		
		return "       Pin change successfully....";
	}

	@Override
	public List<Transaction> miniStatement(Customer customer) {
		
		Integer accountNo = customer.getAccount().getAccountNo();
		String jpql = "select t from Transaction t where t.accountNo = ?1 order by t.transactionId desc";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, accountNo);
		query.setMaxResults(10);
		List<Transaction> list = query.getResultList();
		
		return list;
	}

	
	public void updateCardStatus(String cardNo, String cardStatus) {
		
		AtmCard atmCard = entityManager.find(AtmCard.class, cardNo);
	    entityTransaction.begin();
	    atmCard.setCardStatus(cardStatus);
	    entityTransaction.commit();
		
	}

	
		@Override
	public Integer checkTransactionCount(Integer accountNo, String transactionType, LocalDate transactionDate) {
		String jpql = "select t from Transaction t where t.accountNo = ?1 and t.transactionType=?2 and t.transactionDate = ?3";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, accountNo);
		query.setParameter(2, transactionType);
		query.setParameter(3, transactionDate);
		List<Transaction> list = query.getResultList();
		return list.size();
	}

}



