package com.vm.training.java.oops;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator calc=new Calculator();
		calc.add(2, 3);
		
		double num=calc.add(10,4.0);
		System.out.println(num);
		calc.add(100, 200,300);
		System.out.println(calc.add(100, 200,300,400));
		
		
		
	}

}
