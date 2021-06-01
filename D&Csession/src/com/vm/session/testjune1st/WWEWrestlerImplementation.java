package com.vm.session.testjune1st;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WWEWrestlerImplementation {

	public static void main(String[] args) {


		ArrayList<WWE> arrayList = new ArrayList<WWE>();
		arrayList.add(new WWE("John", "Cena", 210));
		arrayList.add(new WWE("Randy", "Ortan", 205));
		arrayList.add(new WWE("Suresh", "Kumar", 130));
		arrayList.add(new WWE("Anil", "Kumar", 150));
		arrayList.add(new WWE("Great", "Khali", 225));
		
		System.out.println("------Count No.of Wrestlers------");
		long count=arrayList.stream().count();
		System.out.println("Total count = "+count);
		
		
		System.out.println("Weights of Wrestlers Whose weights are above 200");
		long  wrestlersum = arrayList.stream().filter(p->p.getWeight()>200).map(p->p.getWeight()).reduce(0,(A,B)->A+B);
		 System.out.println("sum of wrestlers weight > 200 : "+wrestlersum);
		//printFirstName(arrayList).forEach(p->System.out.println(p));
		
		 System.out.println("FirstName of all wrestlers are: ");
		 printFirstName(arrayList).forEach(p->System.out.println(p));
		System.out.println("======Soritng by First Name=====");
		
		 arrayList.stream().sorted(Comparator.comparing(p->p.getFirstName())).forEach(p->System.out.println(p));
		
		
	}
	private static ArrayList<String> printFirstName(ArrayList<WWE> list)
	{
		 return (ArrayList<String>) list.stream().map(p->p.getFirstName()).collect(Collectors.toList());
		
	}
	
	
}
