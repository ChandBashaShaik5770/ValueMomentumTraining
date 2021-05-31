package com.vm.training.java.oops;

public class GFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandFather gf=new Son(70,45,21);
		gf.walk();
		
		Father f=new Father(70, 45);
		f.walk();
		
	}

}
