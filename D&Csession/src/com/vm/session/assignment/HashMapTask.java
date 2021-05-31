package com.vm.session.assignment;

import java.util.HashMap;

public class HashMapTask {

	
	//static HashMap contacts = new HashMap();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap contacts = new HashMap();
		
		add(contacts,"abc","1234567990");
		add(contacts,"bcd","65478913");
		add(contacts,"cde","2347800");
		add(contacts,"def","963124578");
		
		
		remove(contacts,"def");
		
		printAll(contacts);
		
		
	}
	
	
	static HashMap add(HashMap contacts, String key,String number)
	{
		
		contacts.put(key, number);
		System.out.println(contacts);
		return contacts;
		
	}
	
	
	static HashMap remove(HashMap contacts,String key)
	{
		contacts.remove(key);
		System.out.println("After removing = "+contacts);
		return contacts;
	}
	
	static HashMap printAll(HashMap contacts)
	{
		
		System.out.println(contacts);
		return contacts;
	}

}
