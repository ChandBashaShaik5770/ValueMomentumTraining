package com.vm.training.java.exception;

import java.sql.Connection;
import java.sql.DriverManager;

public class CheckedExceptionIdentity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int i[]= {1,2};
			System.out.println(4/0);
			System.out.println(i[2]);
			CheckedExceptionIdentity c=null;
			System.out.println(c);
			Connection con=DriverManager.getConnection("url","root","root");
			
		}
		
        /*catch(ArithmeticException e)
		{
        	System.out.println(e);
        	
		}
		catch (NullPointerException e1) 
		{
			// TODO: handle exception
		}*/
		catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e2);
			System.exit(0);
		}
		
		finally {
			
		
			System.out.println("I am in finally block");
		}
	}

}
