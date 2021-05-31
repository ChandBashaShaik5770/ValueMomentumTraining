package com.vm.training.java.collection;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	
	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}

	public Movie(double rating, String name, int year) {
		
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public double getRating() { return rating;}
	public String getName() { return name;}
	public int getYear(){ return year; }
	
	
	
}

class TestMovie
{
	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie(8.3,"Force ",2015));
		list.add(new Movie(9.5,"Star Wars ",2013));
		list.add(new Movie(8.9,"Empire Strike back ",2012));
		list.add(new Movie(9.0,"Return of the Jedi ",2017));
		
		Collections.sort(list);
		
		System.out.println("Movies after sorting : ");
		for(Movie m:list)
		{
			System.out.println(m.getName()+"   "+m.getRating()+ "   "+m.getRating());
		}
	}
	
}
