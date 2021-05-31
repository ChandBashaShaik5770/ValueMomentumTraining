package com.vm.training.oops.assignment;

public class MainIBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IBank sbi = new SBI();
		
		IBank axis = new Axis();
		
		IBank icici = new Icici();
		System.out.println("The rate of intrest of sbi is : "+ sbi.rateOfInterest());
		System.out.println("The rate of intrest of icici is : "+ axis.rateOfInterest());
		System.out.println("The rate of intrest of axix is : "+ icici.rateOfInterest());

	}

}
