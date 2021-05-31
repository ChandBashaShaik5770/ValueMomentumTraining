package com.vm.training.java.exception;

public class ProductDidntRecieve extends Exception
{

	String message;
	
	public ProductDidntRecieve(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return "ProductDidntRecieve [message=" + message + "]";
	}
	
	

}
