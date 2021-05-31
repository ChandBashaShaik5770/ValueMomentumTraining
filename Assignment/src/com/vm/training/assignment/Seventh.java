package com.vm.training.assignment;

import java.util.Scanner;

public class Seventh 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input takes numbers");
		int i,s=0;
		for(i=1;i<=5;i++)
		{ 
			System.out.println("Input the number "+i);
			i=sc.nextInt();
			s=s+i;
		}
		float a=s/5;
		System.out.println("The sum of 5 numbers is:"+s);
		System.out.println("The average of 5 numbers is:"+a);
	}


}
