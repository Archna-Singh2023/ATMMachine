package com.atm.basic.service;

import java.time.LocalDate;
import java.util.List;

import com.atm.basic.dao.AtmCardDao;
import com.atm.basic.dao.AtmCardDaoImpl;
import com.atm.basic.entity.Customer;
import com.atm.basic.entity.Transaction;

public class AtmCardServiceImpl implements AtmCardService {
	
	AtmCardDao atmCardDao = new AtmCardDaoImpl();

	@Override
	public String deposit(Customer customer, Integer depositAmount) 
	{
		
		Integer count = atmCardDao.checkTransactionCount(customer.getAccount().getAccountNo(), "Cr", LocalDate.now());
		if(count==3) 
		{
			return "Maximum Deposit limit occured..!! Deposit only 3 time in a Day.";
		}
		else 
		{
		  if(depositAmount>=100000) 
		  {
			  
			  return "Amount should be up to 100000 !! You can Deposit 100000 per-Day.";
			  
		  }
		  else if(depositAmount<100)
		  {
			  return "Amount should be Greater than 100 rupees";
		  }
		  else if(depositAmount>0 || depositAmount<(customer.getAccount().getBalance())) 
		  {
			  if(depositAmount%100==0 || depositAmount%200 ==0 || depositAmount%500==0) 
			  {
				  atmCardDao.deposit(customer, depositAmount);
				  return  "Amount Deposited successfully";
			  }
			  else 
			  {
				  return "Amount should be multiple of 100Rs or 200Rs or 500Rs";
					
			  }
		  }
		  else
		  {
			  return "Enter valid Amount digits";
		  }
		}
		  
	}

	@Override
	public String withdrawal(Customer customer, Integer withdrawAmount) 
	{
		Integer count = atmCardDao.checkTransactionCount(customer.getAccount().getAccountNo(), "Dr", LocalDate.now());
		if(count==3) 
		{
			return "Maximum withdraw limit occured..!! withdraw only 3 time in a Day.";
		}
		else 
		{
		if(withdrawAmount>=25000) 
		{
			return "Amount should be up to 25000 !! You can withdraw only 25000 per-Day.";
		}
		else if(withdrawAmount<100) 
		{
			return "number should be greater than 100Rs";
			
		}
		else if(withdrawAmount>0 && withdrawAmount<(customer.getAccount().getBalance())) 
		{
			if(withdrawAmount%100==0 || withdrawAmount%200==0 ||withdrawAmount%500==0) 
			{
			   atmCardDao.withdrawal(customer, withdrawAmount);
			   return " Amount withdraw successfully";
			}
			else 
			{
				return "amount should be multiple of 100Rs, 200Rs and 500Rs";
			}
		}
		else
		{
		   return "Insufficiant Balance !! Please Enter valid Amount digits";
		}
		}
	}

	@Override
	public Double showBalance(Customer customer) 
	{
		
		return atmCardDao.showBalance(customer);
	}

	@Override
	public String changePin(Customer customer, Integer cardPin)
	{
		if(cardPin.equals(customer.getAtmCard().getCardPin())) 
		{
			return "New Pin matches with Old pin ,Please Enter different Pin No.";
		}
		else 
		{
			atmCardDao.changePin(customer, cardPin);
			return "Pin change successfully";
		}
		
	}

	@Override
	public List<Transaction> miniStatement(Customer customer) 
	{
		return atmCardDao.miniStatement(customer);
	}

	@Override
	public void updateCardStatus(String cardNo, String cardStatus)
	{
		atmCardDao.updateCardStatus(cardNo, cardStatus);
		
	}

	@Override
	public Integer checkTransactionCount(Integer accountNo, String transactionType, LocalDate transactionDate)
	{
		
		return atmCardDao.checkTransactionCount(accountNo, transactionType, transactionDate);
	}

	
	

}
