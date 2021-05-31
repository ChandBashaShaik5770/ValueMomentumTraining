package com.vm.session.multithreading;


class Chand extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i>=9)
			{
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			//System.out.println("Chand = "+i);
			System.out.println("Name = "+Thread.currentThread().getName()+" "+i);
		}
	}
}


class Basha extends Thread
{
	public void run()
	{
		for(int i=21;i<=30;i++)
		{
			if(i==26)
				stop();
			//System.out.println("Basha = "+i);
			System.out.println("Name = "+Thread.currentThread().getName()+" "+i);

		}
	}
}


class Shaik extends Thread
{
	public void run()
	{
		for(int i=41;i<=50;i++)
		{
			//System.out.println("Shaik = "+i);
			System.out.println("Name = "+Thread.currentThread().getName()+" "+i);

		}
	}
}




public class MultitaskingDemo 
{
	public static void main(String[] args) 
	{
		Chand chand = new Chand();
		Basha basha = new Basha();
		Shaik shaik = new Shaik();
		
		chand.setName("Chand");
		basha.setName("Basha");
		shaik.setName("Shaik");
		//hii.run();
		//hello.run();
		//vm.run();
		
		chand.start();
		basha.start();
		shaik.start();
		
	}

}
