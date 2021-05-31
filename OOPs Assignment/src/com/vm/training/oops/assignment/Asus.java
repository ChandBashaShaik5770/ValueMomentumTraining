package com.vm.training.oops.assignment;

public class Asus extends Laptop implements KeyBoard
{
	String ScreenSize;
	public Asus(String brandName, String model, String ram, String storage,String Proccessor, String screenSize) {
		super(brandName, model, ram, storage,Proccessor);
		
		ScreenSize = screenSize;
	}
	@Override

	public void keys() {
		System.out.println("Number of keys in Asus are : 32");
	}
	@Override
	public String toString() {
		return "HP [ScreenSize=" + ScreenSize + ", brandName=" + brandName + ", model="
				+ model + ", ram=" + ram + ", Storage=" + Storage + " ScreenSize="+ScreenSize+"]";
	}


}
