package com.vm.session.testjune1st;

public class SavingsAccount {

	public static void main(String[] args) {


		
		int balance;
		int interest;
		BankAccount bank = new BankAccount();
		balance=5000;
		interest=5;
		int withdraw=bank.withdarw(5000, 2000);
		System.out.println("Initial balance = "+balance);
		System.out.println("Balance = "+withdraw);
		int deposit=bank.deposit(3000);
		System.out.println("Deposit = "+deposit);
		System.out.println(bank.interest(interest));
		
		
		
		
	}

}
