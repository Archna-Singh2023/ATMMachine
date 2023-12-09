package com.atm.basic.presentation;

import java.util.Scanner;

import com.atm.basic.entity.Customer;
import com.atm.basic.service.CustomerService;
import com.atm.basic.service.CustomerServiceImpl;

public class App {
	
	public void displayApp(Customer customer) {
		
		Scanner scanner = new Scanner(System.in);
		AtmApp atmApp = new AtmAppImpl(); 
		CustomerService customerService = new CustomerServiceImpl();
		
		Integer option = 0;
		System.out.println();
		System.out.println("************************************************************");
		System.out.println("                  Well-Come To ATM System                    ");
		System.out.println("***********************************************************");
		
		System.out.println();
		System.out.println("  Well-come " +customer.getCustomerName() +  "     AccountNo : "+customer.getAccount().getAccountNo());
		System.out.println();
		
		do {
		System.out.println("--------------------------------------------------");
		System.out.println("               Choose The Operations              ");
		System.out.println("--------------------------------------------------");
		System.out.println("  Press 1 for Deposit");
		System.out.println("  Press 2 for Withdraw");
		System.out.println("  Press 3 for MiniStatement");
		System.out.println("  Press 4 for ChangePin");
		System.out.println("  Press 5 for Check Balance");
		System.out.println("  Press 6 for Exit");
		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.print("Enter the option : ");
		 option = scanner.nextInt();
		
		switch(option)
		{
		case 1:
			atmApp.deposit(customer);
			break;
		case 2:
			atmApp.withdrawal(customer);
			break;
		case 3:
			atmApp.miniStatement(customer);
			break;
		case 4: 
			atmApp.changePin(customer);
			break;
		case 5:
			atmApp.showBalance(customer);
			break;
		case 6 :
				System.out.println("Thankyou !! "+customer.getCustomerName()+ "  Visit Again..");
		}
	}while(option != 7);
	}

}
