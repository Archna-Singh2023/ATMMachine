package com.atm.basic.presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.atm.basic.entity.Customer;
import com.atm.basic.exception.InvalidInputException;
import com.atm.basic.service.AtmCardService;
import com.atm.basic.service.AtmCardServiceImpl;
import com.atm.basic.service.CustomerService;
import com.atm.basic.service.CustomerServiceImpl;
import com.atm.basic.validation.Validation;

public class Login {

	public static void main(String[] args) 
	{
		CustomerService customerService = new CustomerServiceImpl();
		AtmCardService atmCardService = new AtmCardServiceImpl();
		
		int pinCount = 0;
		boolean flagCardNo = true;
		boolean flagPinNo = true;
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		App app = new  App();
		
		System.out.println("------------------------------------------");
		System.out.println("         Well-Come To ATM System            ");
		System.out.println("--------------------------------------------");
		
		while(flagCardNo)
		{   
			try {
				System.out.print("Enter the Card Number : ");
				String cardNo = scanner.next();
				try {
					if(Validation.checkCardNoLength(cardNo))
					{
						if(customerService.findCardNo(cardNo)!=null) 
						{
							flagCardNo = false;
							 customer = customerService.findCardNo(cardNo);
							 
							if(customer.getAtmCard().getCardStatus().equals("Blocked")) 
							{
								System.out.println("Your Card is Blocked Due to Multiple of Wrong Pin! Please Contact your Bank..");
								System.exit(0);
							}
						
						if(cardNo.equals(cardNo)) 
						{
							while(flagPinNo)
							{
								
							try 
							{
									System.out.print("Enter the Pin number : ");
									Integer cardPin = scanner.nextInt();
									if(cardPin.equals(cardPin)) 
									{
										try 
										{
											if(Validation.checkPinNoLength(cardPin)) 
											{
												if(customerService.findPinNo(customer.getAtmCard().getCardNo(), cardPin)) 
												{
													flagPinNo = false;
													new App().displayApp(customer);
												}
												else 
												{
													pinCount++;
													System.out.println("Wrong Pin Code !! Try Again ");
													if(pinCount>=3) 
													{
														System.out.println("Your Card Is Blocked Due To Multiple Wrong card number . Please Contact Your Bank..");
														atmCardService.updateCardStatus(cardNo, "Blocked");
														System.exit(0);
													}
												}
											}
										}
										catch(InvalidInputException e) 
										{
											System.out.println(e.getMessage());
										}
									}
									else 
									{
										System.out.println("Enter valid Pin Code !");
									}
							  }
							catch(InputMismatchException e) 
							{
										flagPinNo = false;
										System.out.println("You can pass only numeric value.");
							}	  
						}
					}
						else
							{
							     System.out.println("Enter valid Card No !");
					       }
						}
						else 
						{
							System.out.println("Card Number not Exist");
						}
				}
		        }
				catch(InvalidInputException e) 
				{
			       System.out.println(e.getMessage());
		        }
	       }
			catch(InputMismatchException e) 
			{
		         flagCardNo = false;
		        System.out.println("Card number must be Numeric value..");
	        }
       }
    }
}
		
		
		          
		   
		