package com.vm.session.threadCommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		
		Thread t1= new Thread()
				{
			             public void run()
			             {
			            	 System.out.println(customer.withdraw(10000));
			             }
				
				};
				
				
				Thread t2= new Thread()
				{
			             public void run()
			             {
			            	 System.out.println(customer.deposit(5000));
			             }
				
				};
				t1.setName("Withdraw");
				t2.setName("Deposit");
				
				t1.start();
				t2.start();
		
		
	}

}
