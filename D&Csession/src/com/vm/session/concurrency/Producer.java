package com.vm.session.concurrency;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable
{

	BlockingQueue<Integer> commonQueue;
		
	public Producer(BlockingQueue<Integer> commonqueue) {
		super();
		this.commonQueue = commonqueue;
	}



	@Override
	public void run() 
	{

		for(int i=1;i<=10;i++)
		{
			System.out.println("===============================");
			System.out.println("PRODUCER");
			commonQueue.add(i);
			System.out.println("Element added ="+i);
			System.out.println("========================");
		}		
		
	}
	
	

}
