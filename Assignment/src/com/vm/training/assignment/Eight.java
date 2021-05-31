package com.vm.training.assignment;

import java.util.Scanner;

public class Eight 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i;
		
		System.out.println("Input the no fo terms");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Number: "+i+" and cube is: "+(i*i*i));
		}
	}


}
