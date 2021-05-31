package com.vm.training.assignment;

import java.util.Scanner;

public class Fourth 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input a month number");
		int month=sc.nextInt();
		System.out.println("input a year ");
		int year=sc.nextInt();
		int n=0;
		switch(month)
		{
		case 1:
			n=31;
			System.out.println("January "+year+"has"+n+"days");
			break;
		case 2:
			if((year%400==0)||(year%4==0)&&(year%100!=0))
			{
				n=29;
			}
			else
			{
				n=28;
			}
			System.out.println("February "+year+" has "+n+" days");
			break;
		case 3:
			n=31;
			System.out.println("March "+year+" has "+n+" days");
			break;
		case 4:
			n=30;
			System.out.println("April "+year+" has "+n+" days");
			break;
		case 5:
			n=31;
			System.out.println("May "+year+" has "+n+" days");
			break;
		case 6:
			n=30;
			System.out.println("June "+year+" has "+n+" days");
			break;
		case 7:
			n=31;
			System.out.println("July "+year+" has "+n+" days");
			break;
		case 8:
			n=31;
			System.out.println("August "+year+" has "+n+" days ");
			break;
		case 9:
			n=30;
			System.out.println("Spetember "+year+" has "+n+" days ");
			break;
		case 10:
			n=31;
			System.out.println("October "+year+" has "+n+" days");
			break;
		case 11:
			n=30;
			System.out.println("November "+year+" has "+n+" days ");
			break;
		case 12:
			n=31;
			System.out.println("December "+year+" has "+n+" days");
			break;
		
		}

	}


}
