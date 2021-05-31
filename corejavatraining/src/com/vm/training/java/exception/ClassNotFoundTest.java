package com.vm.training.java.exception;

public class ClassNotFoundTest
{
	public static void main(String[] args) {
		
		
		try {
			Class.forName("Test");
			System.out.println("Class Found");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
