package com.vm.session.collectionassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("Enter number of Students : ");
		int num=scanner.nextInt();
		int arr[]=new int[num];
		int marks=0;
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter marks of student "+(i+1));
			arr[i]=scanner.nextInt();
			marks+=arr[i];
			arrayList.add(arr[i]);
		}
		int max=Collections.max(arrayList);
		System.out.println("Highest marks = "+max);
	    double avg=0;
	    avg=marks/num;
	    System.out.println("Average = "+avg);
	    System.out.println("Marks scored by 3rd Student = "+arrayList.get(2));
	    
	    Collections.sort(arrayList);
	    Iterator<Integer> itr = arrayList.iterator();
	    int i=1;
	    System.out.println("Sorted : ");
	    while(itr.hasNext())
	    {
	    	System.out.print(i+"-"+itr.next()+" ");
	    }
	    
	
		
	}

}
