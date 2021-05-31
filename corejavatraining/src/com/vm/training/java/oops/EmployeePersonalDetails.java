package com.vm.training.java.oops;

public class EmployeePersonalDetails extends EmployeeDetails 
{
	
	String nationality;

		
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public static void main(String[] args) {
		
		EmployeePersonalDetails empPerDetails = new EmployeePersonalDetails();
		empPerDetails.setEmpId(101);
		empPerDetails.setName("ABC");
		empPerDetails.setDept("CS");
		empPerDetails.setEmail_ID("abc.com");
		empPerDetails.setMobile("123456");
		empPerDetails.setAddress("GNT");
		empPerDetails.setNationality("India");
		System.out.println(empPerDetails.getEmpId());
		System.out.println(empPerDetails.getName());
		System.out.println(empPerDetails.getDept());
		System.out.println(empPerDetails.getEmail_ID());
		System.out.println(empPerDetails.getNationality());
		
	}

}








/*public EmployeePersonalDetails(int empId, String name, String dept, String email_ID, String mobile, String address,
String nationality) {
super(empId, name, dept, email_ID, mobile, address);
this.nationality = nationality;
}*/

/*@Override
public String toString() {
return "EmployeePersonalDetails [nationality=" + nationality + ", email_ID=" + email_ID + ", mobile=" + mobile
	+ ", address=" + address + ", empId=" + empId + ", name=" + name + ", dept=" + dept + "]";
}*/
