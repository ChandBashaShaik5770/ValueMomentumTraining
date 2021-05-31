package com.vm.session.newFeatures;

interface Test
{
	void display();
}



public class LamdaExpression
{
	public static void main(String[] args) {
		
		Test t1=()->
		{
			System.out.println("Helloo");
			System.out.println("Hiii");
			System.out.println("t1 object");
		};
		t1.display();
		
		
		//Another Method
		System.out.println("===============");
		Test t2=()->System.out.println("t2 object");
		t2.display();
	}

}
