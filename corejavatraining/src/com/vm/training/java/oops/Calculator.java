package com.vm.training.java.oops;

public class Calculator 
{
	int num1,num2,num3;
	int num4;
	double d;
	long sum;
	
	/*int num1,num2;
	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	int sum=0;
	
	
	
	int n1;
	short s;
	byte b;
	long l;
	boolean bl;
	char c;
	float f;
	double d;	
	 int disp()
	 {
		 int n=mul();
		 return n;
	 }
	 void display()
	 {
		 System.out.println(n1);
		 System.out.println(s);
		 System.out.println(b);
		 System.out.println(bl);
		 System.out.println(c);
		 System.out.println(f);
		 System.out.println(d);
	 }*/
	 void add(int num1,int num2)
	{
		sum=num1+num2;
		System.out.println(sum);
	}
	 double add(int num1,double d1)
		{
			d=num1+d1;
			return d;
		}
	 void add(int num1,int num2,int num3)
	 {
		 sum=num1+num2+num3;
		 System.out.println(sum);
	 }
	 long add(int num1,int num2,int num3,int num4)
		{
			sum=num1+num2+num3+num4;
			return sum;
		}

}
