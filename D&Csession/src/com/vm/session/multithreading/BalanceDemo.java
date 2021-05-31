package com.vm.session.multithreading;



class Account
{
     public void balanceCheck(int time)
	{
    	 synchronized (this) {
			
		
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
    	 }
		
		
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i+" outside");
		}
	}
}





class BalanceCheck implements Runnable
{

	
	Account account =new Account();
	
	@Override
	public void run() {

        account.balanceCheck(5);
        
		
	}
	
}








public class BalanceDemo
{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BalanceCheck check = new BalanceCheck();
		
		
		Thread thread= new Thread(check);
		Thread thread1= new Thread(check);
		
		
		thread.setName("Withdraw");
		thread1.setName("Deposit");
		thread.start();
		thread1.start();
		
		
		

	}

}

