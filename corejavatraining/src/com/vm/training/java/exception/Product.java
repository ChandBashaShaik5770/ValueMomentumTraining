package com.vm.training.java.exception;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Details :");
		System.out.println("1. For Product Didn't Recive type === Didntrecieve");
		System.out.println("1. For Product Damaged type       === Damaged");
		System.out.println("1. For Money Refund type          === days");
		System.out.println("Enter the message : ");
		msg=scanner.next();
		try
		{
		if(msg.equals("Didntrecieve"))
		{
			System.out.println("Enter how many days occured : ");
			int days=scanner.nextInt();
			if(days<7)
			{
			throw new ProductDidntRecieve("Product Will be Delivered Shortly!");
			}
			else
			{
				throw new ProductDamaged("Product Will be Replaced");
				
			}
		}

		else if(msg.equals("Damaged"))
          {
	          throw new ProductDamaged("Product Will be Replaced");
          }
		else if(msg.equals("days"))
		{
			System.out.println("Enter No.of Days : ");
			int days=scanner.nextInt();
			if(days>15)
			{
				throw new DaysExceeded("Refund Not Possible");
			}
			else
			{
				System.out.println("Refund Possible");
			}
		}
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
