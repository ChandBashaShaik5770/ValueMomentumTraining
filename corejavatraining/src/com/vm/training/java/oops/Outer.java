package com.vm.training.java.oops;

public class Outer 
{
	
	int num=100;
	
	void display()
	{
		System.out.println(num);
	}
	
	class Inner
	{
		int i=300;
		
		void show()
		{
			System.out.println(i+" "+num);
		}
	}

}
