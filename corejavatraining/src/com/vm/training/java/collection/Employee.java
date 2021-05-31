package com.vm.training.java.collection;

public class Employee 
{
	int empId;
	String name;
	String address;
	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
