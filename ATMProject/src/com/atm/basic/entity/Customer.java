package com.atm.basic.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	
	@Column(length = 30)
	private String  customerName;
	private String  customerContact;
//	private String  customerAddress;
	private String  emailId;
	private String  dob;
	private String  gender;
	private String  aadharNo;
	private String  panNo;
	
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cardNo")
	private AtmCard atmCard;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "accountNo")
	private Account account;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ifscCode")
	private Bank bank;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public AtmCard getAtmCard() {
		return atmCard;
	}

	public void setAtmCard(AtmCard atmCard) {
		this.atmCard = atmCard;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	


	
	
	
}
