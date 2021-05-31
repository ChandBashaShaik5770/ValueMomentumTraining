package com.vm.training.assignment;

import java.util.Scanner;

public class Thirteen
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		do {
			System.out.print(a+" ");
			a++;
		}while(a<=b);
	}


}
