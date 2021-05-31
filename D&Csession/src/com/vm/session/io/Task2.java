package com.vm.session.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			
		
		FileReader fr=new FileReader("sachin.txt");
		
		String str="";
		int n=fr.read();
		while(n!=-1)
		{
			str=str+(char)n;
			n=fr.read();
			
		}
		fr.close();
			String s1="";
			StringBuffer sb=new StringBuffer(str);
			s1=sb.reverse().toString();
			FileWriter fw=new FileWriter("sachin.txt");
			fw.write(s1);
			fw.flush();
			fw.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
