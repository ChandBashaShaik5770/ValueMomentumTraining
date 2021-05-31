package com.vm.training.java.oops;

public class EmployeeDetails extends Employee
{
	String email_ID;
	String mobile;
	String address;
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	/*public EmployeeDetails(int empId, String name, String dept,String email_ID,String mobile,String address) {
		super(empId, name, dept);
		this.email_ID=email_ID;
		this.mobile=mobile;
		this.address=address;
	}
	*/
	/*public String toString()
	{
		return "Emp Id = "+empId+" Name = "+name+" Dept = "+dept+" Email = "+email_ID+" mobile = "+mobile+
				" address = "+address;
	}
	
    public static void main(String[] args) {
	EmployeeDetails empdept=new EmployeeDetails(100, "Abc", "CS", "abc.com", "123456", "gnt");
	System.out.println(empdept);
	}*/
	
	

}
