package com.atm.basic.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AtmCard {
	
	@Id
	private String  cardNo;
	private Integer cardPin;
	private String  issueDate;
	private String  expiryDate;
	private Integer cvvNo;
	private String  cardStatus;
	private String  cardType;
	
	@OneToOne(mappedBy = "atmCard")
	private Customer customer;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Integer getCardPin() {
		return cardPin;
	}

	public void setCardPin(Integer cardPin) {
		this.cardPin = cardPin;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getCvvNo() {
		return cvvNo;
	}

	public void setCvvNo(Integer cvvNo) {
		this.cvvNo = cvvNo;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	

}
