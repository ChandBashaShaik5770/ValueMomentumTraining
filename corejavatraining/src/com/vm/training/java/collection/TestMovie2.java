package com.vm.training.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie1 implements Comparable<Movie1>
{
	private double rating;
	private String name;
	private int year;
	
	public int compareTo(Movie1 m)
	{
		return this.year - m.year;
	}

	public Movie1(double rating, String name, int year) {
		
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public double getRating() { return rating;}
	public String getName() { return name;}
	public int getYear(){ return year; }
	
	
	
}




class RatingCompare implements Comparator<Movie1>
{
	public int compare(Movie1 m1,Movie1 m2)
	{
		if(m1.getRating() < m2.getRating())  return -1;
		if(m1.getRating() > m2.getRating())  return -1;
		else return 0;
	}
}

class NameCompare implements Comparator<Movie1>
{
	public int compare(Movie1 m1,Movie1 m2)
	{
		return m1.getName().compareTo(m1.getName());
	}
}





class TestMovie2
{
	public static void main(String[] args) {
		
		ArrayList<Movie1> list = new ArrayList<Movie1>();
		list.add(new Movie1(8.3,"Force ",2015));
		list.add(new Movie1(9.5,"Star Wars ",2013));
		list.add(new Movie1(8.9,"Empire Strike back ",2012));
		list.add(new Movie1(9.0,"Return of the Jedi ",2017));
		
		System.out.println("Sorted by Reating : ");
		RatingCompare ratingCompare=new RatingCompare();
		
		Collections.sort(list,ratingCompare);
		
		System.out.println("Movies after sorting : ");
		for(Movie1 movie1:list)
		{
			System.out.println(movie1.getName()+"   "+movie1.getRating()+ "   "+movie1.getRating());
		}
		
		
		System.out.println("Sorted by Names : ");
		NameCompare nameCompare=new NameCompare();
		
		Collections.sort(list,nameCompare);
		
		System.out.println("Movies after sorting : ");
		for(Movie1 movie1:list)
		{
			System.out.println(movie1.getName()+"   "+movie1.getRating()+ "   "+movie1.getRating());
		}
	}
	
}
