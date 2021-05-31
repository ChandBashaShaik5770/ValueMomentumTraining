package com.vm.training.assignment;

import java.util.Scanner;

public class Fourteen 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=0,n3=0;
		int i=0;
		for(i=1;i<=3;i++)
		{
			if(i==1)
			{
				System.out.println("input the 1st number");
				n1=sc.nextInt();
				
			}
			else if(i==2)
			{
				System.out.println("input the 2nd number");
				n2=sc.nextInt();
				
			}
			else
			{
				System.out.println("input 3rd number");
				n3=sc.nextInt();
			}
		}
			if((n1<n2)&&(n2<n3))
			{
				System.out.println("increasing");
			}
			else if((n1>n2) && (n2>n3))
			{
				System.out.println("Decreasing");
				
			}
			else
			{
				System.out.println("neither increasing or decreasing");
			}
			
		}



}
