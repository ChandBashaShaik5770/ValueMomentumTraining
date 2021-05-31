package com.vm.session.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f= new File("sachin.txt");
		
		FileWriter fw=new FileWriter(f,true);
		
		fw.write("a");
		fw.write(" HI ");
		fw.write("Hello ");
		fw.write("VM");
		fw.write(" Welcome");
		fw.write("\n");
		
		fw.flush();
		fw.close();
		
		
		System.out.println("Data Written");

	}

}
