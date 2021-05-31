package com.vm.training.assignment;

import java.util.Scanner;

public class Tenth 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Input the number");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}

	}


}
