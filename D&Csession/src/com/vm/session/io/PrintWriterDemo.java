package com.vm.session.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("abc.txt");
		
		pw.write("a");
		pw.print(65);
		
		pw.flush();
		pw.close();

	}

}
