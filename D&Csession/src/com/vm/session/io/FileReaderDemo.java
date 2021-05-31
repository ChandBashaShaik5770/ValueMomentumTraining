package com.vm.session.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {


		File f= new File("sachin.txt");
		
		FileReader fr = new FileReader(f);
		int readChar=fr.read();
		
		while(readChar!=-1)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((char)readChar);
			readChar=fr.read();
		}
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println(fr.read());*/
		
		
		
		
		
		