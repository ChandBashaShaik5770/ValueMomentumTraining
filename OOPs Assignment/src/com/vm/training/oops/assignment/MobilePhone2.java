package com.vm.training.oops.assignment;

public class MobilePhone2
{
	String company;
	String model;
	String ram;
	String Storage;
	public MobilePhone2(String compnay, String model, String ram, String storage) {
		super();
		this.company = compnay;
		this.model = model;
		this.ram = ram;
		Storage = storage;
	}
	@Override
	public String toString() {
		return "MobilePhone2 [Company=" + company + ", model=" + model + ", ram=" + ram + ", Storage=" + Storage + "]";
	}
	void MakeCall()
	{
		System.out.println("Calling is in Progress...");
	}
	void SendMessage()
	{
		System.out.println("Message is sending...");
	}
}



