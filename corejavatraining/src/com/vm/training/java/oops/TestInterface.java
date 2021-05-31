package com.vm.training.java.oops;



public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IVehicle vehicle=new Bus();
		
		vehicle.accelarator();
		vehicle.breaks();
		vehicle.clutches();
		System.out.println(vehicle.gears());
		vehicle.steering();
		
		Car car=new Tata();
		car.ac();
		car.indicators();
		car.accelarator();
		car.breaks();
		car.steering();
		System.out.println(car.gears());

	}

}
