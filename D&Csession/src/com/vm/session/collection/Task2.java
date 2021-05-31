package com.vm.session.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList array=new ArrayList();
		
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(1);
		array.add(6);
		
		System.out.println("ArrayList = "+array);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(array);
		
		System.out.println("Linked = "+lhs);
		
		
		
		
	}

}
