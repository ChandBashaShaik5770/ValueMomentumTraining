package com.vm.training.java.oops;

public class TestAssociation 
{
	
	public static void main(String[] args) 
	{
		showAggregation();
	}
	
	static void showAggregation()
	{
		Address address=new Address();
		address.setCity("Gnt");
		address.setState("AP");
		address.setCountry("India");
		
		System.out.println(address);
		Emp emp=new Emp();
		emp.setEmpId(100);
		emp.setName("ABC");
		emp.setAddress(address);
		System.out.println("-----------------");
		System.out.println(emp);
		emp=null;
		System.out.println("-------------");
		
		System.out.println(emp);
		System.out.println("-------------");
		
		System.out.println(address);
		
		
	}

}
