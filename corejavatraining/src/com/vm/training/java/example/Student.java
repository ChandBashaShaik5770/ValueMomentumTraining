package com.vm.training.java.example;

import java.util.ArrayList;

public class Student 
{
	
	String name;
	int id;
	String branch;
	int age;
	String city;
	public Student(String name, int id, String branch, int age, String city) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
		this.age = age;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", branch=" + branch + ", age=" + age + ", city=" + city + "]";
	}
	
	
	

}
