package com.vm.training.java.oops;

public class Customer {

	int id;
	String firstName;
	String lastName;
	String account;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public Customer()
	{
		System.out.println("In default Constructor");
	}
	


	


	/*void show()
	{
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(account);
	}*/

}
