package com.atm.basic.validation;

import java.util.regex.Pattern;

import com.atm.basic.exception.InvalidInputException;

public class Validation {
	
	public static boolean checkCardNoLength(String cardNo) throws InvalidInputException
	{

		if (cardNo.length()==16)
			return true;
		else
			throw new InvalidInputException("Card No must be 16 digits.");
	}
	
	public static boolean checkPinNoLength(Integer cardPin) throws InvalidInputException 
	{
		if(cardPin.toString().length()==4) 
			return true;
		else
			throw new InvalidInputException("Card Pin must be 4 digit.");	
	}
	
	public static boolean checkCardFormat(String cardNo) throws InvalidInputException
	{
		String cardNoRegex = "[0-9]+";
		if(cardNo.matches(cardNoRegex))
			return true;
		else
			throw new InvalidInputException("Card No should contain only digits.");
	}
	
	public static Boolean checkAmountFormat(Integer amount)throws InvalidInputException
	{
		String amountRegex = "[0-9]+";
		if(amount.toString().matches(amountRegex))
			return true;
		else
			throw new InvalidInputException("Amount have digits only.");
	}
	
	

}
