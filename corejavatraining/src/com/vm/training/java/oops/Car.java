package com.vm.training.java.oops;

public abstract class Car implements IVehicle
{

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Steering in Car");
		
	}

	@Override
	public void breaks() {
		// TODO Auto-generated method stub
		System.out.println("Breaks applied in Car");
		
	}

	@Override
	public void accelarator() {
		// TODO Auto-generated method stub
		System.out.println("Accelarator applied in Car");
		
	}

	@Override
	public void clutches() {
		// TODO Auto-generated method stub
		System.out.println("Clutch applied in Car");

		
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	abstract void ac();
    abstract void indicators();
	
	

}
