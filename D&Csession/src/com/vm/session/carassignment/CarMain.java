package com.vm.session.carassignment;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(1965, "BatMobile", 0);
		
		System.out.println("-------When Accelerating-----------");
		accelerate(car);
		accelerate(car);
		accelerate(car);
		accelerate(car);
		accelerate(car);
		
		
		System.out.println("-------When Breaking-----------");
		breaks(car);
		breaks(car);
		breaks(car);
		breaks(car);
		breaks(car);
		

	}


static void accelerate(Car car)
{
	int speed=5;
	speed=car.getSpeed()+speed;
	car.setSpeed(speed);
	
	System.out.println("Current speed = "+speed);
}


static void breaks(Car car)
{
	int speed=5;
	speed=car.getSpeed()-speed;
	car.setSpeed(speed);
	
	System.out.println("Current speed = "+speed);
}
}
