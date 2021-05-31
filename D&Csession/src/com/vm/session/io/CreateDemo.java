package com.vm.session.io;

import java.io.File;
import java.io.IOException;

public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f= new File("C:\\Users\\Shaik Chand Basha\\Documents\\D&C Session\\sachin.txt");
		
		if(f.exists())
		{
			System.out.println("File already exists");
		}
		
		else
		{
			System.out.println("File not Present. We are creating!");
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File created");
		}
		
		
		
	}

}
