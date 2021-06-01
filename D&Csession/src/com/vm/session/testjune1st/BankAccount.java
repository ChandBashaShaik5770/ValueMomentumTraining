package com.vm.session.testjune1st;

public class BankAccount 
{
	int withdarw(int balance,int withdraw)
	{
		if(balance<withdraw)
		{
			System.out.println("Withdraw doesnot possible");
		}
		else
		{
			balance=balance-withdraw;
		
		}
		
		return balance;
		
	}
	int deposit(int amount)
	{
		//System.out.println("Amount deposited "+amount);
		return amount;

	}
	
	int interest(int in)
	{
		System.out.println("Interest = "+in+" %");
		return in;
	}
	
	
	

}
