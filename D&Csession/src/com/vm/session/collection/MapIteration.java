package com.vm.session.collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapIteration {

	public static void main(String[] args) {

		HashMap<String, Integer> hm =new HashMap<String, Integer>();
				hm.put("sam", 95);
				hm.put("hari", 80);
				hm.put("mohan", 90);
				
				
				for(Integer h:hm.values())
				{
					System.out.println(h);
				}
				
				
				for(String h:hm.keySet())
				{
					System.out.println(h);
				}
				
				for(java.util.Map.Entry<String, Integer> h:hm.entrySet())
				{
					System.out.println(h);
				}
				
				
		
		
	}

}
