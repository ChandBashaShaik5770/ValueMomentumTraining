package com.vm.training.assignment;

import java.util.Scanner;

public class Eleventh 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int f1=0;
		int f2=1;
		int f3;
		System.out.println("Input the number");
		int n=sc.nextInt();
		System.out.print(f1+" "+f2);
		for(i=2;i<=n;i++)
		{
			
			f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2; 
			f2=f3;
			
		}
		
	}


}
