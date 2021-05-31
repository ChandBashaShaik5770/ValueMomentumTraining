package com.vm.training.java.oops;

public class Employee 
{
	protected int empId;
	protected String name;
	protected String dept;
	
	public Employee(){}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*public Employee(int empId,String name,String dept)
	{
		this.empId=empId;
		this.name=name;
		this.dept=dept;
	}*/
	
}
	
	/*public String toString()
	{
		return empId+"  "+name+"  "+dept;
	}
	*/
	
	/*public static void main(String[] args) {
		
		Employee emp=new Employee();
		Employee emp1=new Employee(10,"abc","cs");
		
		System.out.println(emp);
		System.out.println(emp1);
	}*/

