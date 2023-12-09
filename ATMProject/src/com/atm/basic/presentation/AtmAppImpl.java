package com.atm.basic.presentation;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.atm.basic.entity.Customer;
import com.atm.basic.entity.Transaction;
import com.atm.basic.service.AtmCardService;
import com.atm.basic.service.AtmCardServiceImpl;

public class AtmAppImpl implements AtmApp {
	
	Scanner scanner = new Scanner(System.in);

	AtmCardService atmCardService = new AtmCardServiceImpl();
	
	@Override
	public void deposit(Customer customer) 
	{
		while(true) 
		{
		  System.out.print("Enter the Amount to deposit : ");
		  Integer depositAmount = scanner.nextInt();
		
		  System.out.println();
		
		  System.out.println(atmCardService.deposit(customer, depositAmount));
		  System.out.print("Do you want to deposit more amount : (Yes or No) ");
		  char option1 = scanner.next().charAt(0);
		  if(option1 =='n' || option1 =='N') 
			break;
		}

		System.out.println("-----------------------------------------------");
		System.out.println("           Please collect Your Card             ");
		System.out.println("-----------------------------------------------");
		System.out.println();
	}

	@Override
	public void withdrawal(Customer customer) 
	{
		while(true) 
		{
		  System.out.print("Enter the withdraw Amount : ");
		  Integer withdrawAmount = scanner.nextInt();
		
		   System.out.println();
		
		   System.out.println(atmCardService.withdrawal(customer, withdrawAmount));
		   System.out.print("Do you want to withdraw more amount : ");
		   char option1 = scanner.next().charAt(0);
			if(option1 =='n' || option1 =='N') 
				break;
		}
		 System.out.println("Total Available Balance is : "+customer.getAccount().getBalance());
		 System.out.println("-----------------------------------------------");
		 System.out.println("           Please collect Your Card            ");
		 System.out.println("-----------------------------------------------");
		 System.out.println();
			
	}

	@Override
	public void showBalance(Customer customer) 
	{
		
		System.out.println("Available Balance  = " +atmCardService.showBalance(customer));
		System.out.println();
	}

	@Override
	public void changePin(Customer customer)
	{
		try 
		{
		   System.out.println("Enter new Pin : ");
		   Integer pinNo = scanner.nextInt();
		if(pinNo.toString().length()==4) 
		{
		  System.out.println(atmCardService.changePin(customer, pinNo));
		  System.out.println();
		}
		else 
		{
			System.out.println("pin No must be 4 digits only.."); 
		}
		}
		catch(InputMismatchException e) 
		{
			System.out.println("You can pass only digits..");
		}
	}

	@Override
	public void miniStatement(Customer customer) 
	{
		
	 List<Transaction>	list = atmCardService.miniStatement(customer);
	 Iterator<Transaction> itr = list.iterator();
	 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	 System.out.println("                                                Mini-Statement                               ");
	 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
	 System.out.println("TransactionId\t\tAmount\t\tTransactionDate\t\tTransactionTime\t\tAccountNo\t\tTransactionType");
	 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
	 while(itr.hasNext()) 
	 {
		 Transaction transaction = itr.next();
		 System.out.println("  "+transaction.getTransactionId()+"\t\t        "+transaction.getAmount()+"\t\t   "+transaction.getTransactionDate()+"\t\t   "+transaction.getTransactionTime()+"\t\t  "+transaction.getAccountNo()+" \t\t"+transaction.getTransactionType());
	 }
	 
	 System.out.println();
	 System.out.println("Total Available Balance is : "+customer.getAccount().getBalance());
	 System.out.println();
		
	}	

}
