package com.vm.training.java.exception;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithResourscesTest 
{
	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream(new File("E:\\chand.txt")))
		{
			String s="Value Momentum";
			byte[] by=s.getBytes();
			fos.write(by);
			System.out.println("Success");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
		
	}

}
