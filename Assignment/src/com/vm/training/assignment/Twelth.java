package com.vm.training.assignment;

import java.util.Scanner;

public class Twelth
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input no of numbers");
		int c=sc.nextInt();
		int s=0;
		while(c>0)
		{
			int n=sc.nextInt();
			if(n>0)
			{
				s=s+n;
			}
			c--;
			
		}
		System.out.println("Sum is : "+s); 
		
		
	}


}
