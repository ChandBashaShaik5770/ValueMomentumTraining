package com.vm.session.multithreading;

class Parent
{
	void phone()
	{
		System.out.println("IPhone");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Parent();
		parent.phone();
		
		Parent parent2 = new Parent()
				{
			void phone()
			{
				System.out.println("Oppo");
			}
			
			
				};
				
				parent2.phone();
				
	}

}
