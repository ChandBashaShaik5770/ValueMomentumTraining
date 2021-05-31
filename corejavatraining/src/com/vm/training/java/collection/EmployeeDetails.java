package com.vm.training.java.collection;

public class EmployeeDetails extends Employee
{
	String city;
	String PAN;
	public EmployeeDetails(int empId, String name, String address,String city, String PAN)
	{
		super(empId, name, address);
		this.city=city;
		this.PAN=PAN;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [city=" + city + ", PAN=" + PAN + "]";
	}
	
	
	
	
	
	
	

}
