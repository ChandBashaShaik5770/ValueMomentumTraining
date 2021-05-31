package com.vm.training.assignment;

import java.util.Scanner;

public class Fifteen 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    long n;
	   int c=0;
	   System.out.println("Input a number less than 10 billion");
	   n=sc.nextInt();
	   while(n>0) {
		   n=n/10;
		   c++;
	   }
		System.out.println(c); 
	}


}
