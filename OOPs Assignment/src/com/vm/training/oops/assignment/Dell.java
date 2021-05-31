package com.vm.training.oops.assignment;

public class Dell extends Laptop implements KeyBoard
{
	String GraphicCardSize;

	public Dell(String brandName, String model, String ram, String storage,String proccessor, String graphicCardSize) {
		super(brandName, model, ram, storage,proccessor);
		GraphicCardSize = graphicCardSize;
	}
	@Override
	public String toString() {
		return "Dell [GraphicCardSize=" + GraphicCardSize + ", brandName=" + brandName + ", model=" + model + ", ram=" + ram
				+ ", Proccessor="+proccessor+" Storage=" + Storage + " GraphicCardSize="+GraphicCardSize+"]";
	}
	public void keys() {
		System.out.println("Number of keys in Dell are : 25");
	}

	

}
