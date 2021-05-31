package com.vm.session.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class AllMapTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap hm=new HashMap();
		hm.put(1, "Abc");
		hm.put(2, "Bcd");
		hm.put(3, "Cde");
		hm.put(4, "Def");
		hm.put(4, "Efg");
		
		System.out.println("HashMap = "+hm);
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put(1, "Abc");
		lhm.put(2, "Bcd");
		lhm.put(3, "Cde");
		lhm.put(4, "Def");
		lhm.put(4, "Efg");
		
		System.out.println("LinkedHashMap = "+lhm);
		
		
		
	}

}
