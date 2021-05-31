package com.vm.training.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*
	 * 	//TREE SET EXAMPLE
		TreeSet ts = new TreeSet();
		TreeSet t = new TreeSet();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        
        System.out.println("Elements: "+ts);
        t.add("ABC");
        t.add("bcd");
        t.addAll(ts);
        System.out.println(t);
        //check is set empty?
        System.out.println("Is set empty: "+ts.isEmpty());
        //delete all elements from set
        ts.clear();
        System.out.println("Is set empty: "+ts.isEmpty());
        ts.add("c");
        ts.add("java");
        ts.add("python");
        System.out.println("Size of the set: "+ts.size());
        //remove one string
        ts.remove("python");
        System.out.println("Elements: "+ts);
		
		
		
		*/
		
		
		
		//Inserting multiple Arraylist's into Single Arraylist 
		ArrayList arrayList = new ArrayList();
		arrayList.add("Chand");
		arrayList.add("Basha");
		arrayList.add("Shaik");
		arrayList.add("java");
		ArrayList arrayList1 = new ArrayList();
		arrayList1.add("abc");
		arrayList1.add("bcd");
		arrayList1.add("cde");
		
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add("hiii");
		arrayList2.add("hello");
		arrayList2.add("VM");

		ArrayList<ArrayList> ar=new ArrayList<ArrayList>();
		ArrayList<ArrayList> ar1=new ArrayList<ArrayList>();;

		
		ar.add(arrayList);
		
		ar.add(arrayList1);
		ar.add(arrayList2);
		System.out.println("New Array List : "+ar);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		
		System.out.println(ar1);
		System.out.println("---------------");
		System.out.println(ar1.isEmpty());
		if(ar1.isEmpty()!=false)
		{
		ar1.add(arrayList1);
		ar1.add(arrayList2);
		}
		System.out.println(ar1);
		System.out.println(ar1.get(1).get(1));
		System.out.println(ar1.get(1).get(1));
		System.out.println(ar1.get(1).get(1));
		
		
		/*
		//HASH SET EXAMPLE
		HashSet hash=new HashSet();
		
		hash.add("abc");
		hash.add("acb");
		hash.add("baa");
		hash.add("Cat");
		hash.add("haa");
		hash.add("moo");
		System.out.println("---------------------");
		System.out.println(hash);
		System.out.println(hash.contains("baa"));
		System.out.println(hash.contains("bab"));
		
		
		
		
		/*
		//Map Program Example
		Map map=new HashMap();
		map.put(100, "Chand");
		map.put(200, "Basha");
		map.put(300, "Shaik");
		map.put(400, "java");
		map.put(500, "oops");
		System.out.println(map);
		System.out.println(map.isEmpty());
		map.remove(500);
		System.out.println(map);
		map.replace(400, "VM");
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.containsValue("oops"));
		System.out.println(map.containsValue("VM"));
		System.out.println(map.size());*/
		
		
			
		
		
		/*ArrayList Program Example
		ArrayList Program Example
		ArrayList arrayList = new ArrayList();
		arrayList.add("Chand");
		arrayList.add("Basha");
		arrayList.add("Shaik");
		arrayList.add("java");
		arrayList.add("java");
		arrayList.add("java");
		arrayList.add(100);
		arrayList.add(30.0);
		System.out.println(arrayList);
		arrayList.remove(4);
		System.out.println(arrayList);
		System.out.println(arrayList.contains("Chand"));*/
		
		
		
		
		
		

	}

}
