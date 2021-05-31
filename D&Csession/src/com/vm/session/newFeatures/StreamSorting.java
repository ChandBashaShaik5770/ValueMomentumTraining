package com.vm.session.newFeatures;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamSorting
{
	
	
	ArrayList<Integer> sortlist1(ArrayList<Integer> l)
	{
		return (ArrayList<Integer>) l.stream().sorted().collect(Collectors.toList());
	}
	
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(1);
		num.add(8);
		num.add(5);
		num.add(4);
		
		num.forEach(System.out::println);
		System.out.println("After sorting");
		num.stream().sorted().forEach(System.out::println);;
		
		StreamSorting s=new StreamSorting();
		System.out.println(s.sortlist1(num));
		
		
		ArrayList<String> num1 = new ArrayList<String>();
		num1.add("b");
		num1.add("a");
		num1.add("z");
		num1.add("n");
		num1.add("r");
		
		num1.forEach(System.out::println);
		System.out.println("After sorting");
		num1.stream().sorted().forEach(System.out::println);;
		
		
	
}



	private char[] sortlist(ArrayList<Integer> num) {
		// TODO Auto-generated method stub
		return null;
	}

}
