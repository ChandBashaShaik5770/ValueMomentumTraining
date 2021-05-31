package com.vm.training.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;


public class SetTest 
{
	public static void main(String[] args) 
	{
		//LINKED HASH MAP EXAMPLE
		LinkedHashMap m=new LinkedHashMap();
		LinkedHashMap m1=new LinkedHashMap();
		
		m.put(101,"One");
		m.put(102,"java");
		m.put(103,"Chand");
		m.put(104,"Basha");
		System.out.println(m.isEmpty());
		if(m.isEmpty()!=true)
		{
			System.out.println(m);
			
			
		}
		
		m1.put(201,"abc");
		m1.put(202,"hii");
		m1.putAll(m);
		System.out.println(m1);
		m1.remove(101);
		System.out.println(m1);
		System.out.println(m1.size());
		if(m1.containsKey(102))
		{
			System.out.println(m1);
		}
		
				
		
		
		
		
		
		/*LINKED LIST PROGRAM EXAMPLE
		LinkedList l = new LinkedList();
		LinkedList l1 = new LinkedList();
	
        l.add("one");
        l.add("two");
        l.add("three");
        System.out.println(l);
       System.out.println(l.contains("two"));
       System.out.println(l.indexOf("three"));
       l1.add("java");
       l1.add("ava");
       l1.push("c");
       System.out.println(l1);
       System.out.println(l.isEmpty());
       System.out.println(l1.equals(l));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* HASHMAP PROGRAM EXAMPLE
		System.out.println("HASHMAP");
		HashMap hash=new HashMap();
		hash.put(100, "Abc");
		hash.put(200,null);
		hash.put(100, "bcd");
		hash.put(null, "adc");
		HashMap h2=new HashMap();
		h2.clone();
		h2.put(300,"c++");
		System.out.println("H2 "+h2);
		System.out.println(hash);
		
		HashMap h=new HashMap();
		h.put(1,"afbf");
		h.putAll(hash);
		System.out.println(h);
		System.out.println(h.get(200));
		
		System.out.println("-------------------------");
		
		System.out.println("TREEMAP");
		TreeMap m=new TreeMap();
		m.put(500, "java");
		m.put(501,"oops");
		m.put(502,null);
	    //m.put(null,"mand");
		
		System.out.println(m);
		
		
		
		
		
		
		
		
		
		 
		/*ARRAYLIST EXAMPLE
		ArrayList<Employee> arrayList=new ArrayList<>();
		arrayList.add(new Employee(100,"Chand","GNT"));
		System.out.println(arrayList);
		ArrayList<EmployeeDetails> arr=new ArrayList<>();
		arr.add(new EmployeeDetails(100,"Chand","GNT","Guntur","ajsb23a"));
		System.out.println(arr);
		
		ArrayList array=new ArrayList();
		
		array.add("Abc");
		array.add("xyz");
		array.add("def");
		array.add(new Integer(10));
		array.add(new Double(30.0));
		array.add(new Boolean(false));
		System.out.println(array);
		
		String s=(String)array.get(2);
		System.out.println(s);
		String s1=(String)array.get(0);
		System.out.println(s1);
		String s2=(String)array.get(5);
		System.out.println(s2);
		*/
		

		

		
		
		
		
		
		
		
		
	}

}
