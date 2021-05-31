package com.vm.session.collectionassignment;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreCard {

	public static void main(String[] args) {

		Map<String, Integer> map = new TreeMap<String, Integer>();
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter Runs Scored");
		while(true)
		{
			
			String name=scanner.next();
			if(name.equals("0"))
			{
				break;
			}
			else
			{
			System.out.println("Enter Runs Scored By : "+name);
			int runs=scanner.nextInt();
			map.put(name, runs);
			}
		}
		
		System.out.println("Players who batted");
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey());
		}
		System.out.println("Scores by Players");
		int total=0;
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
			total+=entry.getValue();
		}
		System.out.println("Total Score : "+total);
		
		int highScore=Collections.max(map.values());
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==highScore)
			{
		
		System.out.println("Name of Highest Scorer : "+entry.getKey());
		
			}
		}
		
		System.out.println("Runs Scored by Dhoni : "+map.get("Dhoni"));
				
	}

}
