package com.vm.training.java.bankassignment;

public class MaintainMinimumBalanceException extends Exception
{
	String message;
	
	public MaintainMinimumBalanceException(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return "MaintainMinimumBalanceException [message=" + message + "]";
	}
	
	
	

}
