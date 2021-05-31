package com.vm.training.java.strings;

import java.util.Scanner;

public class StringObjectCreation
{
	public static void main(String[] args) {
		String s1= new String("Value Momentum");
		String s2="Value Momentum";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.toUpperCase());
		
		String s3=" Hyd";
		System.out.println(s1.concat(s3));
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s1.indexOf('m'));
		
		System.out.println(s1.length());
		
		System.out.println(s2.compareToIgnoreCase(s1));
		s1=s1+s3+" Telangana";
		System.out.println(s1);
		String s="    Value   Momentum     ";
		System.out.println(s.replaceAll("\\s",""));
		String s7="Hii Hello. Welcome to the java training from value momentum";
		System.out.println(s7);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to be find");
		String s5=scanner.next();
		String s6[]=s7.split(" ");
		int c=0;
		for(int i=0;i<s6.length;i++)
		{
			if(s5.equals(s6[i]))
			{
				c++;
			}
		}
		
		System.out.println(c);
		
		
		
	}

}
