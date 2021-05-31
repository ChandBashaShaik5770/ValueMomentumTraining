package com.vm.session.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many records : ");
		int num=scanner.nextInt();
		FileWriter fw = new FileWriter("Demo.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		//bw.write(null);
		int id;
		String name,dept;
		bw.write("ID"+"\t\t"+"NAME"+"\t\t"+"DEPT");
		bw.newLine();
		for(int i=0;i<num;i++)
		{
		System.out.println("Enter ID ");
		id=scanner.nextInt();
		System.out.println("Enter Name ");
		name=scanner.next();
		System.out.println("Enter Dept ");
		dept=scanner.next();
		
		
		bw.write(id+"\t\t"+name+"\t\t"+dept);
		
		
		System.out.println("Record Inserted Succesfully!");
		bw.newLine();
		
		
		}
		
		bw.flush();
		bw.close();
		/*File f1=new File("Demo.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		int readChar = br.read();
		
		while(readChar!=-1)
		{
			System.out.println((char)readChar);
			readChar=br.read();
			System.out.println("\n");
		}
		
		
		br.close();*/
		

	}

}
