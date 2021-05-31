package com.vm.training.java.exception;

public class LowBalanceExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance=999;
		try
		{
		if(balance<1000)
		{
			throw new LowBalanceException("Your Balance is "+balance+" it's Less than 1000 rs");
			
		}
		else
		{
			System.out.println("You have sufficient Balance");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
