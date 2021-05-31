package com.vm.session.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample 
{
	public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(3);
		arr.add(14);
		arr.add(5);
		arr.add(7);
		arr.add(8);
		
		if(search(arr,14))
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
		


		sort(arr);
		System.out.println("Ascending order : "+arr);
		reverse(arr);
		System.out.println("Reverse order : "+arr);
		
		System.out.println("even : "+evensum(arr));
		
	}
	
	static boolean search(ArrayList arr,Integer key)
	{
		return arr.contains(key);
	}

	
	static ArrayList sort(ArrayList arr)
	{
		Collections.sort(arr);
		return arr;
	}
	static ArrayList reverse(ArrayList arr)
	{
		Collections.reverse(arr);
		return arr;
	}
	
	static int evensum(ArrayList arr)
	{
		Iterator<Integer> itr = arr.iterator();
		
		int c=0;
		while(itr.hasNext())
		{
			if(itr.next()%2==0)
			{
				c=c+itr.next();
			}
		}
		return c;
	}

}
