package com.vm.session.multithreading;



class Bottle
{
	synchronized public void drink(int time)
	{
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}





class Drink implements Runnable
{

	
	Bottle bottle =new Bottle();
	
	@Override
	public void run() {

        bottle.drink(5);
        
		
	}
	
}








public class SynchronizedDemo
{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drink drink = new Drink();
		
		
		Thread thread= new Thread(drink);
		Thread thread1= new Thread(drink);
		
		
		thread.setName("ABC ");
		thread1.setName("BCD ");
		thread.start();
		thread1.start();
		
		
		

	}

}
