package com.vm.training.java.basics;

public class FirstProgram {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int sum=0;
		sum=num1+num2;
		System.out.println(sum);
		show();
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
    System.out.println("This is first java program");
	}

	public static void show()
	{
		System.out.println("Inside Show method");
		int num=12345;
		int number=num++ + ++num - ++num;
		if(number>10000)
		{
			System.out.println("Greater");
		}
		else
		{
			System.out.println("Not Greater");
		}
		
	}
}
