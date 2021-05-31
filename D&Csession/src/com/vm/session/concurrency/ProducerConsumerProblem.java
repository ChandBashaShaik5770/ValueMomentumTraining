package com.vm.session.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerProblem
{
	
	public static void main(String[] args) {
		
		
		BlockingQueue<Integer> bq = new LinkedBlockingDeque<Integer>();
		
		Producer producer = new Producer(bq);
		
		
		Consumer consumer = new Consumer(bq);
		
		
		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);
		
		thread1.start();
		thread2.start();
		
		
		
		
	}

}
