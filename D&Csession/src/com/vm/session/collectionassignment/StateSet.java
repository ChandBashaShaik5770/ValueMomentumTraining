package com.vm.session.collectionassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class StateSet 
{
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\Shaik Chand Basha\\Documents\\D&C Session\\states.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		LinkedHashSet<String> stateSet=new LinkedHashSet<String>();
		
		String line=br.readLine();
		while(line!=null)
		{
			stateSet.add(line);
			line=br.readLine();
		}
		System.out.println("Total no of states:"+stateSet.size());
		System.out.println(stateSet.remove("Delhi"));
		System.out.println(stateSet);
		System.out.println("The States Which Have Name Starting With 'K' are : ");
		for (String i : stateSet) {
			
			if(i.startsWith("K"))
			{
				System.out.println(i);
			}
		}
		
		
		
		SortedSet<String> sortstates=new TreeSet<String>(stateSet);
		System.out.println("After Sorting : "+sortstates);
		br.close();
		
	}


}
