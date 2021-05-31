package com.vm.session.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileWriter fw=new FileWriter("sachin.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("hello");
		bw.write("hiii");
		
		bw.flush();
		fw.close();
	}

}
