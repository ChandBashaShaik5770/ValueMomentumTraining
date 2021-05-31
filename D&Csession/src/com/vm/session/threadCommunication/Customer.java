package com.vm.session.threadCommunication;

public class Customer 
{
	int balance=5000;
	
	synchronized int withdraw(int amount)
	{
		if(balance<amount)
		{
			System.out.println("Waiting you don't have sufficient balance");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " is going to withdraw");	
		
		balance-=amount;
		return balance;
	}
	
	
	
	synchronized public int deposit(int amount)
	{
		balance+=amount;
		System.out.println(Thread.currentThread().getName()+" is Deposited");
		
		notifyAll();
		
		return balance;
	}

}
