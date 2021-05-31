package com.vm.session.newFeatures;

interface Validate
{
	void validateLogin();
}


class Car
{
	void myLogin()
	{
		System.out.println("You can login using username and password");
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Validate v=()->System.out.println("Login successful");
		v.validateLogin();
		
		Car car =new Car();
		Validate v1=car::myLogin;
		v1.validateLogin();
		
		
		
		
	}

}
