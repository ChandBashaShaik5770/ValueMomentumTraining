package com.vm.session.newFeatures;

interface Bank
{
	default void openAccount()
	{
		System.out.println("You can apply account online");
	}
	
	static void holiday()
	{
		System.out.println("holiday on weekends");
	}
	
	int rateOfInterest(int interest);
	int minBalance(int amount);
}

class Axis implements Bank
{

	@Override
	public int rateOfInterest(int interest) {
		
		return interest;
	}

	@Override
	public int minBalance(int amount) {
		return amount;
	}
	
}





public class NewInterfaceDemo 
{
	public static void main(String[] args) {
		
		Bank bank = new Axis();
		bank.openAccount();
	    Bank.holiday();
	    System.out.println("Rate of interest = "+bank.rateOfInterest(5)+"%");
	    System.out.println("Min Balanace = "+bank.minBalance(1000));
	}

}
