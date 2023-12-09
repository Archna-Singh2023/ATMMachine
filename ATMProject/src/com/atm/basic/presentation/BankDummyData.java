package com.atm.basic.presentation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.atm.basic.entity.Account;
import com.atm.basic.entity.AtmCard;
import com.atm.basic.entity.Bank;
import com.atm.basic.entity.Customer;


public class BankDummyData {

	public static void main(String[] args) {
		
		Bank bank1 = new Bank();
		Bank bank2 = new Bank();
//		Bank bank3 = new Bank();
		
		AtmCard atmCard1 = new AtmCard();
		AtmCard atmCard2 = new AtmCard();
		AtmCard atmCard3 = new AtmCard();
		AtmCard atmCard4 = new AtmCard();
		AtmCard atmCard5 = new AtmCard();
		AtmCard atmCard6 = new AtmCard();
		AtmCard atmCard7 = new AtmCard();
		AtmCard atmCard8 = new AtmCard();
		AtmCard atmCard9 = new AtmCard();
		AtmCard atmCard10 = new AtmCard();
		
		AtmCard atmCard11 = new AtmCard();
		AtmCard atmCard12 = new AtmCard();
		AtmCard atmCard13 = new AtmCard();
		AtmCard atmCard14 = new AtmCard();
		AtmCard atmCard15 = new AtmCard();
		AtmCard atmCard16 = new AtmCard();
		AtmCard atmCard17 = new AtmCard();
		AtmCard atmCard18 = new AtmCard();
		AtmCard atmCard19 = new AtmCard();
		AtmCard atmCard20 = new AtmCard();
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		Customer customer4 = new Customer();
		Customer customer5 = new Customer();
		Customer customer6 = new Customer();
		Customer customer7 = new Customer();
		Customer customer8 = new Customer();
		Customer customer9 = new Customer();
		Customer customer10 = new Customer();
		
		Customer customer11 = new Customer();
		Customer customer12 = new Customer();
		Customer customer13 = new Customer();
		Customer customer14 = new Customer();
		Customer customer15 = new Customer();
		Customer customer16 = new Customer();
		Customer customer17 = new Customer();
		Customer customer18 = new Customer();
		Customer customer19 = new Customer();
		Customer customer20 = new Customer();
		
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		Account account4 = new Account();
		Account account5 = new Account();
		Account account6 = new Account();
		Account account7 = new Account();
		Account account8 = new Account();
		Account account9 = new Account();
		Account account10 = new Account();
		
		Account account11 = new Account();
		Account account12 = new Account();
		Account account13 = new Account();
		Account account14 = new Account();
		Account account15 = new Account();
		Account account16 = new Account();
		Account account17 = new Account();
		Account account18 = new Account();
		Account account19 = new Account();
		Account account20 = new Account();
		
		bank1.setIfscCode("HDFC00011120");
		bank1.setBankName("HDFC");
		bank1.setBranchCode("1520");
		
		bank2.setIfscCode("PUNB00011120");
		bank2.setBankName("PNB");
		bank2.setBranchCode("1521");
		
		
		customer1.setCustomerId(10000001);
		customer1.setCustomerName("Archna");
		customer1.setCustomerContact("9988776655");
		customer1.setEmailId("archna@123gmail.com");
		customer1.setGender("Female");
		customer1.setDob("10/10/2003");
		customer1.setAadharNo("990088006600");
		customer1.setPanNo("DH9966789");
		customer1.setBank(bank1);
		
		
		customer2.setCustomerId(10000002);
		customer2.setCustomerName("Prince");
		customer2.setCustomerContact("9988776644");
		customer2.setEmailId("prince@123gmail.com");
		customer2.setGender("Male");
		customer2.setDob("25/10/2005");
		customer2.setAadharNo("990088006611");
		customer2.setPanNo("AB9966789");
		customer2.setBank(bank1);
		
		customer3.setCustomerId(10000003);
		customer3.setCustomerName("Pinki");
		customer3.setCustomerContact("9988776633");
		customer3.setEmailId("pinki@123gmail.com");
		customer3.setGender("Female");
		customer3.setDob("04/10/2002");
		customer3.setAadharNo("990088006622");
		customer3.setPanNo("CD9966789");
		customer3.setBank(bank1);
		
		customer4.setCustomerId(10000004);
		customer4.setCustomerName("Kavita");
		customer4.setCustomerContact("9988776622");
		customer4.setEmailId("kavita@123gmail.com");
		customer4.setGender("Female");
		customer4.setDob("08/10/2004");
		customer4.setAadharNo("990088006633");
		customer4.setPanNo("DE9966789");
		customer4.setBank(bank1);
		
		customer5.setCustomerId(10000005);
		customer5.setCustomerName("Pooja");
		customer5.setCustomerContact("9988776611");
		customer5.setEmailId("pooja@123gmail.com");
		customer5.setGender("Female");
		customer5.setDob("25/10/2000");
		customer5.setAadharNo("990088006644");
		customer5.setPanNo("EF9966789");
		customer5.setBank(bank1);
		
		customer6.setCustomerId(10000006);
		customer6.setCustomerName("Komal");
		customer6.setCustomerContact("9988776600");
		customer6.setEmailId("komal@123gmail.com");
		customer6.setGender("Female");
		customer6.setDob("25/10/2001");
		customer6.setAadharNo("990088006612");
		customer6.setPanNo("AB9966789");
		customer6.setBank(bank1);
		
		customer7.setCustomerId(10000007);
		customer7.setCustomerName("Teena");
		customer7.setCustomerContact("9988776666");
		customer7.setEmailId("teena@123gmail.com");
		customer7.setGender("Female");
		customer7.setDob("25/10/2007");
		customer7.setAadharNo("990088006611");
		customer7.setPanNo("DH9966789");
		customer7.setBank(bank1);
		
		customer8.setCustomerId(10000008);
		customer8.setCustomerName("Nitish");
		customer8.setCustomerContact("9988776677");
		customer8.setEmailId("nitish@123gmail.com");
		customer8.setGender("Male");
		customer8.setDob("25/10/2001");
		customer8.setAadharNo("990088006619");
		customer8.setPanNo("AB9990789");
		customer8.setBank(bank1);
		
		customer9.setCustomerId(10000009);
		customer9.setCustomerName("Vishnu");
		customer9.setCustomerContact("9988776644");
		customer9.setEmailId("vishnu@123gmail.com");
		customer9.setGender("Male");
		customer9.setDob("25/10/1998");
		customer9.setAadharNo("990088008811");
		customer9.setPanNo("KKA9966789");
		customer9.setBank(bank1);
		
		customer10.setCustomerId(10000000);
		customer10.setCustomerName("Vandna");
		customer10.setCustomerContact("9988776666");
		customer10.setEmailId("vandna@123gmail.com");
		customer10.setGender("Female");
		customer10.setDob("02/10/2003");
		customer10.setAadharNo("990088002211");
		customer10.setPanNo("AB9900789");
		customer10.setBank(bank1);
		
		customer11.setCustomerId(10000011);
		customer11.setCustomerName("Yashi");
		customer11.setCustomerContact("9988776000");
		customer11.setEmailId("yashi@123gmail.com");
		customer11.setGender("Female");
		customer11.setDob("10/10/2003");
		customer11.setAadharNo("900088006600");
		customer11.setPanNo("DH9966789");
		customer11.setBank(bank2);
		
		
		customer12.setCustomerId(10000012);
		customer12.setCustomerName("Yami");
		customer12.setCustomerContact("9988776655");
		customer12.setEmailId("yami@123gmail.com");
		customer12.setGender("Female");
		customer12.setDob("10/10/2003");
		customer12.setAadharNo("990088006600");
		customer12.setPanNo("DH9966789");
		customer12.setBank(bank2);
		
		
		customer13.setCustomerId(10000013);
		customer13.setCustomerName("Yashika");
		customer13.setCustomerContact("9988776655");
		customer13.setEmailId("yashika@123gmail.com");
		customer13.setGender("Female");
		customer13.setDob("10/10/2003");
		customer13.setAadharNo("990088006600");
		customer13.setPanNo("DH9966789");
		customer13.setBank(bank2);
		
		customer14.setCustomerId(10000014);
		customer14.setCustomerName("Ananya");
		customer14.setCustomerContact("9988776655");
		customer14.setEmailId("ananya@123gmail.com");
		customer14.setGender("Female");
		customer14.setDob("10/10/2003");
		customer14.setAadharNo("990088006600");
		customer14.setPanNo("DH9966789");
		customer14.setBank(bank2);
		
		customer15.setCustomerId(10000015);
		customer15.setCustomerName("Anamika");
		customer15.setCustomerContact("9988776655");
		customer15.setEmailId("anamika@123gmail.com");
		customer15.setGender("Female");
		customer15.setDob("10/10/2003");
		customer15.setAadharNo("990088006600");
		customer15.setPanNo("DH9966789");
		customer15.setBank(bank2);
		
		customer16.setCustomerId(10000016);
		customer16.setCustomerName("Pinku");
		customer16.setCustomerContact("9988776655");
		customer16.setEmailId("pinku@123gmail.com");
		customer16.setGender("Female");
		customer16.setDob("10/10/2003");
		customer16.setAadharNo("990088006600");
		customer16.setPanNo("DH9966789");
		customer16.setBank(bank2);
		
		customer17.setCustomerId(10000017);
		customer17.setCustomerName("Nikki");
		customer17.setCustomerContact("9988776655");
		customer17.setEmailId("nikki@123gmail.com");
		customer17.setGender("Female");
		customer17.setDob("10/10/2003");
		customer17.setAadharNo("990088006600");
		customer17.setPanNo("DH9966789");
		customer17.setBank(bank2);
		
		customer18.setCustomerId(10000018);
		customer18.setCustomerName("Nisha");
		customer18.setCustomerContact("9988776655");
		customer18.setEmailId("nisha@123gmail.com");
		customer18.setGender("Female");
		customer18.setDob("10/10/2003");
		customer18.setAadharNo("990088006600");
		customer18.setPanNo("DH9966789");
		customer18.setBank(bank2);
		
		customer19.setCustomerId(10000019);
		customer19.setCustomerName("Nayra");
		customer19.setCustomerContact("9988776655");
		customer19.setEmailId("nayra@123gmail.com");
		customer19.setGender("Female");
		customer19.setDob("10/10/2003");
		customer19.setAadharNo("990088006600");
		customer19.setPanNo("DH9966789");
		customer19.setBank(bank2);
		
		customer20.setCustomerId(10000020);
		customer20.setCustomerName("Vanya");
		customer20.setCustomerContact("9988776655");
		customer20.setEmailId("vanya@123gmail.com");
		customer20.setGender("Female");
		customer20.setDob("10/10/2003");
		customer20.setAadharNo("990088006600");
		customer20.setPanNo("DH9966789");
		customer20.setBank(bank2);
		
		
		atmCard1 = new AtmCard();
		atmCard1.setCardNo("5058481010704422");
		atmCard1.setCardPin(8766);
		atmCard1.setCardType("Visa");
		atmCard1.setCardStatus("Active");
		atmCard1.setIssueDate(LocalDate.now().toString());
		atmCard1.setExpiryDate("2025-10-04");
		atmCard1.setCvvNo(111);
		atmCard1.setCustomer(customer1);
		
		customer1.setAtmCard(atmCard1);
		
		
		
		atmCard2.setCardNo("5058481010704423");
		atmCard2.setCardPin(8755);
		atmCard2.setCardType("Visa");
		atmCard2.setCardStatus("Active");
		atmCard2.setIssueDate(LocalDate.now().toString());
		atmCard2.setExpiryDate("2025-10-04");
		atmCard2.setCvvNo(112);
		atmCard2.setCustomer(customer2);
		
		customer2.setAtmCard(atmCard2);
		
		
		atmCard3.setCardNo("5058481010704424");
		atmCard3.setCardPin(8744);
		atmCard3.setCardType("Visa");
		atmCard3.setCardStatus("Active");
		atmCard3.setIssueDate(LocalDate.now().toString());
		atmCard3.setExpiryDate("2025-10-04");
		atmCard3.setCvvNo(113);
		atmCard3.setCustomer(customer3);
		
		customer3.setAtmCard(atmCard3);
		
		
		atmCard4.setCardNo("5058481010704425");
		atmCard4.setCardPin(8733);
		atmCard4.setCardType("Visa");
		atmCard4.setCardStatus("Active");
		atmCard4.setIssueDate(LocalDate.now().toString());
		atmCard4.setExpiryDate("2025-10-04");
		atmCard4.setCvvNo(114);
		atmCard4.setCustomer(customer4);
		
		customer4.setAtmCard(atmCard4);
		
		
		atmCard5.setCardNo("5058481010704426");
		atmCard5.setCardPin(8722);
		atmCard5.setCardType("Visa");
		atmCard5.setCardStatus("Active");
		atmCard5.setIssueDate(LocalDate.now().toString());
		atmCard5.setExpiryDate("2025-10-04");
		atmCard5.setCvvNo(115);
		atmCard5.setCustomer(customer5);
		
		customer5.setAtmCard(atmCard5);
		
		atmCard6.setCardNo("5058481010704427");
		atmCard6.setCardPin(8711);
		atmCard6.setCardType("Visa");
		atmCard6.setCardStatus("Active");
		atmCard6.setIssueDate(LocalDate.now().toString());
		atmCard6.setExpiryDate("2025-10-04");
		atmCard6.setCvvNo(116);
		atmCard6.setCustomer(customer6);
		
		customer6.setAtmCard(atmCard6);
		
		atmCard7.setCardNo("5058481010704428");
		atmCard7.setCardPin(8700);
		atmCard7.setCardType("Visa");
		atmCard7.setCardStatus("Active");
		atmCard7.setIssueDate(LocalDate.now().toString());
		atmCard7.setExpiryDate("2025-10-04");
		atmCard7.setCvvNo(117);
		atmCard7.setCustomer(customer7);
		
		customer7.setAtmCard(atmCard7);
		
		atmCard8.setCardNo("5058481010704429");
		atmCard8.setCardPin(8799);
		atmCard8.setCardType("Visa");
		atmCard8.setCardStatus("Active");
		atmCard8.setIssueDate(LocalDate.now().toString());
		atmCard8.setExpiryDate("2025-10-04");
		atmCard8.setCvvNo(118);
		atmCard8.setCustomer(customer8);
		
		customer8.setAtmCard(atmCard8);
		
		atmCard9.setCardNo("5058481010704420");
		atmCard9.setCardPin(8788);
		atmCard9.setCardType("Visa");
		atmCard9.setCardStatus("Active");
		atmCard9.setIssueDate(LocalDate.now().toString());
		atmCard9.setExpiryDate("2025-10-04");
		atmCard9.setCvvNo(119);
		atmCard9.setCustomer(customer9);
		
		customer9.setAtmCard(atmCard9);
		
		atmCard10.setCardNo("5058481010704421");
		atmCard10.setCardPin(8722);
		atmCard10.setCardType("Visa");
		atmCard10.setCardStatus("Active");
		atmCard10.setIssueDate(LocalDate.now().toString());
		atmCard10.setExpiryDate("2025-10-04");
		atmCard10.setCvvNo(110);
		atmCard10.setCustomer(customer10);
		
		customer10.setAtmCard(atmCard10);
		
		atmCard11 = new AtmCard();
		atmCard11.setCardNo("5158481010704422");
		atmCard11.setCardPin(8766);
		atmCard11.setCardType("Visa");
		atmCard11.setCardStatus("Active");
		atmCard11.setIssueDate(LocalDate.now().toString());
		atmCard11.setExpiryDate("2025-10-04");
		atmCard11.setCvvNo(111);
		atmCard11.setCustomer(customer11);
		
		customer11.setAtmCard(atmCard11);
		
		
		
		atmCard12.setCardNo("5258481010704423");
		atmCard12.setCardPin(8755);
		atmCard12.setCardType("Visa");
		atmCard12.setCardStatus("Active");
		atmCard12.setIssueDate(LocalDate.now().toString());
		atmCard12.setExpiryDate("2025-10-04");
		atmCard12.setCvvNo(112);
		atmCard12.setCustomer(customer12);
		
		customer12.setAtmCard(atmCard12);
		
		
		atmCard13.setCardNo("5358481010704424");
		atmCard13.setCardPin(8744);
		atmCard13.setCardType("Visa");
		atmCard13.setCardStatus("Active");
		atmCard13.setIssueDate(LocalDate.now().toString());
		atmCard13.setExpiryDate("2025-10-04");
		atmCard13.setCvvNo(113);
		atmCard13.setCustomer(customer13);
		
		customer13.setAtmCard(atmCard13);
		
		
		atmCard14.setCardNo("5458481010704425");
		atmCard14.setCardPin(8733);
		atmCard14.setCardType("Visa");
		atmCard14.setCardStatus("Active");
		atmCard14.setIssueDate(LocalDate.now().toString());
		atmCard14.setExpiryDate("2025-10-04");
		atmCard14.setCvvNo(114);
		atmCard14.setCustomer(customer14);
		
		customer14.setAtmCard(atmCard14);
		
		
		atmCard15.setCardNo("5558481010704426");
		atmCard15.setCardPin(8722);
		atmCard15.setCardType("Visa");
		atmCard15.setCardStatus("Active");
		atmCard15.setIssueDate(LocalDate.now().toString());
		atmCard15.setExpiryDate("2025-10-04");
		atmCard15.setCvvNo(115);
		atmCard15.setCustomer(customer15);
		
		customer15.setAtmCard(atmCard15);
		
		atmCard16.setCardNo("5658481010704427");
		atmCard16.setCardPin(8711);
		atmCard16.setCardType("Visa");
		atmCard16.setCardStatus("Active");
		atmCard16.setIssueDate(LocalDate.now().toString());
		atmCard16.setExpiryDate("2025-10-04");
		atmCard16.setCvvNo(116);
		atmCard16.setCustomer(customer16);
		
		customer16.setAtmCard(atmCard16);
		
		atmCard17.setCardNo("5758481010704428");
		atmCard17.setCardPin(8700);
		atmCard17.setCardType("Visa");
		atmCard17.setCardStatus("Active");
		atmCard17.setIssueDate(LocalDate.now().toString());
		atmCard17.setExpiryDate("2025-10-04");
		atmCard17.setCvvNo(117);
		atmCard17.setCustomer(customer17);
		
		customer17.setAtmCard(atmCard17);
		
		atmCard18.setCardNo("5858481010704429");
		atmCard18.setCardPin(8799);
		atmCard18.setCardType("Visa");
		atmCard18.setCardStatus("Active");
		atmCard18.setIssueDate(LocalDate.now().toString());
		atmCard18.setExpiryDate("2025-10-04");
		atmCard18.setCvvNo(118);
		atmCard18.setCustomer(customer18);
		
		customer18.setAtmCard(atmCard18);
		
		atmCard19.setCardNo("5958481010704420");
		atmCard19.setCardPin(8788);
		atmCard19.setCardType("Visa");
		atmCard19.setCardStatus("Active");
		atmCard19.setIssueDate(LocalDate.now().toString());
		atmCard19.setExpiryDate("2025-10-04");
		atmCard19.setCvvNo(119);
		atmCard19.setCustomer(customer19);
		
		customer19.setAtmCard(atmCard19);
		
		atmCard20.setCardNo("6058481010704421");
		atmCard20.setCardPin(8722);
		atmCard20.setCardType("Visa");
		atmCard20.setCardStatus("Active");
		atmCard20.setIssueDate(LocalDate.now().toString());
		atmCard20.setExpiryDate("2025-10-04");
		atmCard20.setCvvNo(110);
		atmCard20.setCustomer(customer20);
		
		customer20.setAtmCard(atmCard20);
		
		
		account1.setAccountNo(123456789);
		account1.setAccountType("Saving");
		account1.setAccountStatus("Active");
		account1.setAccountOpeningDate(LocalDate.now().toString());
		account1.setBalance(15000.0);
		account1.setCustomer(customer1);
		
		customer1.setAccount(account1);
		
		account2.setAccountNo(123456780);
		account2.setAccountType("Saving");
		account2.setAccountStatus("Active");
		account2.setAccountOpeningDate(LocalDate.now().toString());
		account2.setBalance(25000.0);
		account2.setCustomer(customer2);
		
		customer2.setAccount(account2);
		
		account3.setAccountNo(123456781);
		account3.setAccountType("Saving");
		account3.setAccountStatus("Active");
		account3.setAccountOpeningDate(LocalDate.now().toString());
		account3.setBalance(20000.0);
		account3.setCustomer(customer3);
		
		customer3.setAccount(account3);
		
		account4.setAccountNo(123456782);
		account4.setAccountType("Saving");
		account4.setAccountStatus("Active");
		account4.setAccountOpeningDate(LocalDate.now().toString());
		account4.setBalance(35000.0);
		account4.setCustomer(customer4);
		
		customer4.setAccount(account4);
		
		account5.setAccountNo(123456783);
		account5.setAccountType("Saving");
		account5.setAccountStatus("Active");
		account5.setAccountOpeningDate(LocalDate.now().toString());
		account5.setBalance(10000.0);
		account5.setCustomer(customer5);
		
		customer5.setAccount(account5);
		
		account6.setAccountNo(123456784);
		account6.setAccountType("Saving");
		account6.setAccountStatus("Active");
		account6.setAccountOpeningDate(LocalDate.now().toString());
		account6.setBalance(15000.0);
		account6.setCustomer(customer6);
		
		customer6.setAccount(account6);
		
		account7.setAccountNo(123456785);
		account7.setAccountType("Saving");
		account7.setAccountStatus("Active");
		account7.setAccountOpeningDate(LocalDate.now().toString());
		account7.setBalance(5000.0);
		account7.setCustomer(customer7);
		
		customer7.setAccount(account7);
		
		account8.setAccountNo(123456786);
		account8.setAccountType("Saving");
		account8.setAccountStatus("Active");
		account8.setAccountOpeningDate(LocalDate.now().toString());
		account8.setBalance(17000.0);
		account8.setCustomer(customer8);
		
		customer8.setAccount(account8);
		
		account9.setAccountNo(123456787);
		account9.setAccountType("Saving");
		account9.setAccountStatus("Active");
		account9.setAccountOpeningDate(LocalDate.now().toString());
		account9.setBalance(45000.0);
		account9.setCustomer(customer9);
		
		customer9.setAccount(account9);
		
		account10.setAccountNo(123456788);
		account10.setAccountType("Saving");
		account10.setAccountStatus("Active");
		account10.setAccountOpeningDate(LocalDate.now().toString());
		account10.setBalance(15000.0);
		account10.setCustomer(customer10);
		
		customer10.setAccount(account10);
		
		account11.setAccountNo(223456789);
		account11.setAccountType("Saving");
		account11.setAccountStatus("Active");
		account11.setAccountOpeningDate(LocalDate.now().toString());
		account11.setBalance(15000.0);
		account11.setCustomer(customer11);
		
		customer11.setAccount(account11);
		
		account12.setAccountNo(223456780);
		account12.setAccountType("Saving");
		account12.setAccountStatus("Active");
		account12.setAccountOpeningDate(LocalDate.now().toString());
		account12.setBalance(25000.0);
		account12.setCustomer(customer12);
		
		customer12.setAccount(account12);
		
		account13.setAccountNo(223456781);
		account13.setAccountType("Saving");
		account13.setAccountStatus("Active");
		account13.setAccountOpeningDate(LocalDate.now().toString());
		account13.setBalance(20000.0);
		account13.setCustomer(customer13);
		
		customer13.setAccount(account13);
		
		account14.setAccountNo(223456782);
		account14.setAccountType("Saving");
		account14.setAccountStatus("Active");
		account14.setAccountOpeningDate(LocalDate.now().toString());
		account14.setBalance(35000.0);
		account14.setCustomer(customer14);
		
		customer14.setAccount(account14);
		
		account15.setAccountNo(223456783);
		account15.setAccountType("Saving");
		account15.setAccountStatus("Active");
		account15.setAccountOpeningDate(LocalDate.now().toString());
		account15.setBalance(10000.0);
		account15.setCustomer(customer15);
		
		customer15.setAccount(account15);
		
		account16.setAccountNo(223456784);
		account16.setAccountType("Saving");
		account16.setAccountStatus("Active");
		account16.setAccountOpeningDate(LocalDate.now().toString());
		account16.setBalance(15000.0);
		account16.setCustomer(customer16);
		
		customer16.setAccount(account16);
		
		account17.setAccountNo(223456785);
		account17.setAccountType("Saving");
		account17.setAccountStatus("Active");
		account17.setAccountOpeningDate(LocalDate.now().toString());
		account17.setBalance(5000.0);
		account17.setCustomer(customer17);
		
		customer17.setAccount(account17);
		
		account18.setAccountNo(223456786);
		account18.setAccountType("Saving");
		account18.setAccountStatus("Active");
		account18.setAccountOpeningDate(LocalDate.now().toString());
		account18.setBalance(17000.0);
		account18.setCustomer(customer18);
		
		customer18.setAccount(account18);
		
		account19.setAccountNo(223456787);
		account19.setAccountType("Saving");
		account19.setAccountStatus("Active");
		account19.setAccountOpeningDate(LocalDate.now().toString());
		account19.setBalance(45000.0);
		account19.setCustomer(customer19);
		
		customer19.setAccount(account19);
		
		account20.setAccountNo(223456788);
		account20.setAccountType("Saving");
		account20.setAccountStatus("Active");
		account20.setAccountOpeningDate(LocalDate.now().toString());
		account20.setBalance(15000.0);
		account20.setCustomer(customer20);
		
		customer20.setAccount(account20);
		

		List<Customer> ll = List.of(customer1, customer2, customer3,customer4,customer5,customer6,customer7,customer8,customer9,customer10);
		List<Customer> l1 = List.of(customer11, customer12, customer13, customer14, customer15, customer16, customer17, customer18, customer19, customer20);

		bank1.setCustomer(ll);
		bank2.setCustomer(l1);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atm");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(bank1);
		entityManager.persist(bank2);
		entityTransaction.commit();
		
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("Dummy Data Created......");


	}

}
