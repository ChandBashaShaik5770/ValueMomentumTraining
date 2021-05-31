package com.vm.session.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try
		{
		File f=new File("numbers.txt");
		
		if(!f.exists())
		{
			f.createNewFile();
		}
		String s="";
		Scanner scanner = new Scanner(f);
		while(scanner.hasNextLine())
		{
			s=s+scanner.nextLine();
		}
		String s1[]=s.split(",");
		for(int i=0;i<s1.length;i++)
		{
			if(Integer.parseInt(s1[i])%2!=0)
			{
				System.out.println(s1[i]+" ");
			}
		}
		scanner.close();
		}
		catch (Exception e) {

			e.printStackTrace();

			
		}
		
		
	}

}
