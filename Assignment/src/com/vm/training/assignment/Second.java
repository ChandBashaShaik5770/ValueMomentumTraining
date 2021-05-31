package com.vm.training.assignment;

import java.util.Scanner;

public class Second 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("input the 1st number");
		a=sc.nextInt();
		System.out.println("input the 2nd number");
		b=sc.nextInt();
		System.out.println("input the 3rd number");
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("Greaest number is :"+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("Greaetest number is :"+b);
		}
		else
		{
			System.out.println("Greatest number is :"+c);
		}
	}


}
