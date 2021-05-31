package com.vm.training.java.example;


import java.util.HashMap;
import java.util.Scanner;

public class StudentDetails 
{
	
		public static void main(String[] args) {
			
		String name;
		int id;
		String branch;
		int age;
		String city;
		//ArrayList arrayList = new ArrayList();
		
				
		Student s1;
		Student s2;
		Student s3;
		Student s4;
		Student s5;
		Student s6;
		Student s7;
		Student s;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1 or 2 or 3");
		int number=sc.nextInt();
		if(number>3)
		{
			System.out.println("Enter Number 1 or 2 or 3");
			number=sc.nextInt();
		}
		HashMap m=new HashMap();
		HashMap m1=new HashMap();
		
		
			if(number==1)
			{
			 s1=new Student("Chand", 101, "CSE", 21, "GNT");			
			 s2 = new Student("Basha", 102, "CSE", 21, "GNT");
			 s3 = new Student("ABC", 103, "EC", 21, "VJWD");
			 s4 = new Student("DEF", 104, "CIVIL", 21, "VZG");
			 s5 = new Student("CSK", 105, "CIVIL", 21, "VZG");
			 s6 = new Student("MSD", 106, "CIVIL", 21, "VZG");
			 s7 = new Student("ABD", 107, "CIVIL", 21, "VZG");
		
	
	
		m.put(101, s1);
		m.put(102, s2);
		m.put(103, s3);
		m.put(104, s4);
		m.put(105, s5);
		m.put(106, s6);
		m.put(107, s7);
		
		System.out.println("Student Details Added Successfully");
		}
		
		
		
		
		System.out.println("To View records Enter 2 ");
		int number1=sc.nextInt();
		
		
		if(number1==2)
		{
			System.out.println("Enter Key to view record : ");
			int n1=sc.nextInt();
			if(m.containsKey(n1))
			{
			System.out.println(m.get(n1));
			}
			else
			{
				System.out.println("Invalid Key, View Not Possible!");
			}
			//System.out.println(arrayList);
		}
		
		
		
		
		System.out.println("To Update records enter 3");
		int number2=sc.nextInt();
		if(number2==3)
		{
			System.out.println("Enter Key to Update record : ");
			int n2=sc.nextInt();
			if(m.containsKey(n2))
			{
				System.out.println("Enter name : ");
				name=sc.next();
				System.out.println("Enter ID : ");
				id=sc.nextInt();
				System.out.println("Enter Branch : ");
				branch=sc.next();
				System.out.println("Enter Age : ");
				age=sc.nextInt();
				System.out.println("Enter City : ");
				city=sc.next();
				s=new Student(name, id, branch, age, city);
				m.put(n2, s);
				System.out.println("Record Updated Successfully");
				System.out.println("Updated Record : "+m.get(n2));

				
			}
		
		
		else
		{
			System.out.println("Invalid Key Update Not Possible!");
		}
		}
		sc.close();
	}

		

}










//Student student1 = new Student("Chand", 101, "CSE", 21, "GNT");
		//Student student2 = new Student("Basha", 102, "CSE", 21, "GNT");
		//Student student3 = new Student("ABC", 103, "EC", 21, "VJWD");
		//Student student4 = new Student("DEF", 104, "CIVIL", 21, "VZG");


/*System.out.println("Enter name : ");
name=sc.next();
System.out.println("Enter ID : ");
id=sc.nextInt();
System.out.println("Enter Branch : ");
branch=sc.next();
System.out.println("Enter Age : ");
age=sc.nextInt();
System.out.println("Enter City : ");
city=sc.next();*/

//arrayList.add(student2);
		//arrayList.add(student3);
		//arrayList.add(student4);






