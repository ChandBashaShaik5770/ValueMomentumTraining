package com.vm.training.assignment;

import java.util.Scanner;

public class Fifth
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a year");
		int year=sc.nextInt();
		if((year%400==0)||(year%4==0))
		{
			if(year%100!=0)
			{
				System.out.println("leap year");
			}
		}
		else
		{
			System.out.println("Not leap year");
		}
	}


}
