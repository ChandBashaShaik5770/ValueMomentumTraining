package com.vm.session.testjune1st;

import java.util.Scanner;

public class EmpMain 
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String validate;
		String firstname="Chand";
		String lastname="";
		Employee employee=new Employee(firstname,lastname);
		validate=employee.ValaidateMethod(firstname,lastname);
		
		
	}

}
