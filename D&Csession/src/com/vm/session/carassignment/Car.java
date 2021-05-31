package com.vm.session.carassignment;

public class Car
{
	
	int yearModel;
	String make;
	int speed;
	public Car(int yearModel, String make, int speed) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		this.speed = speed;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [yearModel=" + yearModel + ", make=" + make + ", speed=" + speed + "]";
	}
	
	
	

}
