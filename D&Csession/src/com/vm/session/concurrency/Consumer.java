package com.vm.session.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable 
{
	BlockingQueue<Integer> commonQueue;	
	
	public Consumer(BlockingQueue<Integer> commonQueue) {
		super();
		this.commonQueue = commonQueue;
	}




	@Override
	public void run() {

		while(true)
		{
			try {
				System.out.println("CONSUMER");
				System.out.println("Consumed Element = "+commonQueue.take());
				System.out.println("===============================");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
