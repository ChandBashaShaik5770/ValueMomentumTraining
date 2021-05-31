package com.vm.session.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WrestlerMain 
{
	public static void main(String[] args)
	{
		ArrayList<Wrestler> wrestlers = new ArrayList<Wrestler>();
		
		wrestlers.add(new Wrestler("John Cena", 100, 5.8));
		wrestlers.add(new Wrestler("Orton", 103, 6.2));
		wrestlers.add(new Wrestler("Rock", 110, 5.9));
		wrestlers.add(new Wrestler("Sting", 105, 6.0));
		
		for(Wrestler wrestler : wrestlers)
		{
			System.out.println(wrestler);
		}
		
		
		System.out.println("-------------After  Weight  Sorting------------");
		Collections.sort(wrestlers, new WeightSort());
		
		for(Wrestler wrestler : wrestlers)
		{
			System.out.println(wrestler);
		}
		
		System.out.println("-------------After  Height  Sorting------------");
		Collections.sort(wrestlers, new HeightSort());
		
		for(Wrestler wrestler : wrestlers)
		{
			System.out.println(wrestler);
		}
		
		
		
	}

}



class WeightSort implements Comparator<Wrestler>
{

	@Override
	public int compare(Wrestler o1, Wrestler o2) 
	{
		if(o1.getWeight()>o2.getWeight())
		{
			
			return 1;
		}
		else if(o1.getWeight()==o2.getWeight())
		{
			return 0;
		}
		else		
		    return -1;
	}
	
}




//Height Sorting
class HeightSort implements Comparator<Wrestler>
{

	@Override
	public int compare(Wrestler o1, Wrestler o2) 
	{
		if(o1.getHeight()>o2.getHeight())
		{
			
			return 1;
		}
		else if(o1.getHeight()==o2.getHeight())
		{
			return 0;
		}
		else		
		    return -1;
	}
	
}