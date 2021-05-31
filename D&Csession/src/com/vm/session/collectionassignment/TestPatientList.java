package com.vm.session.collectionassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class TestPatientList {

	public static void main(String[] args) {

		Patient patient1 = new Patient(101, "Sam", 21);
		Patient patient2 = new Patient(102, "Kumar", 20);
		Patient patient3 = new Patient(103, "Hari", 22);
		
		
		ArrayList<Patient> arrayList = new ArrayList<Patient>();
		
		arrayList.add(patient1);
		arrayList.add(patient2);
		arrayList.add(patient3);
		
		System.out.println("Details = "+arrayList);
		
		Collections.sort(arrayList,new SortByNames());
		System.out.println("======After Sorting by Names=====");
		for(Patient p : arrayList)
		{
			System.out.println(p);
		}
		
		
		System.out.println("======After Sorting by Age=====");
		
		Iterator itr= arrayList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		TreeMap tm =new TreeMap();
		tm.put(1, patient1);
		tm.put(2, patient2);
		tm.put(3, patient3);
		System.out.println("Elements in Tree Set = "+tm);
		
	}
}

class SortByNames implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) 
	{
		return o1.getName().compareTo(o2.getName());
	}

	
}

class AgeSorting implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) 
	{
		if(o1.getAge()==o2.getAge())
		{
			return 0;
		}
		else if(o1.getAge()>=o2.getAge())
		{
			return 1;
		}
		else
		  return -1;
	}
	

}
