package com.vm.session.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr =new FileReader("sachin.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String read=br.readLine();   
        while(read!=null)
        {  
        System.out.print(read); 
        read=br.readLine();
        }  
        br.close();   
		
		
		
		

	}

}
