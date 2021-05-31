package com.vm.session.concurrency;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap<String, Integer> hm =new HashMap<String, Integer>();
		ConcurrentHashMap<String, Integer> hm=new ConcurrentHashMap<String,Integer>();
		hm.put("sam", 95);
		hm.put("hari", 80);
		hm.put("mohan", 90);
		
		System.out.println("Elements = "+hm);
		
		/*hm.computeIfAbsent("lalit",a->75);
		hm.computeIfAbsent("abc", a->70);
		System.out.println(hm.containsValue(95));
		System.out.println(hm.containsValue(94));
		System.out.println(hm.containsValue(70));
		System.out.println(hm.containsKey("hii"));
		System.out.println(hm.containsKey("sam"));
		System.out.println("After adding = "+hm);*/
		
		for(Integer val:hm.values())
		{
			System.out.println(val);
			hm.computeIfAbsent("lalit", l->80);
		}
		
		System.out.println(hm);
		
		
	}

}
