package com.vm.session.newFeatures;

interface Calculate1
{
	void addition(int a,int b);
	
}

interface Calculate2
{
	int multiply(int a,int b);
	
}

interface Large
{
	int findLargest(int a,int b);
}


public class LamdaExpressionWithParameters 
{
	public static void main(String[] args) {
		
		Calculate1 c1=(a,b)->System.out.println("Additon = "+(a+b));
		c1.addition(2, 3);
		
		Calculate2 c2=(a,b)->a*b;
		System.out.println("Multiply = "+c2.multiply(3, 3));
		
		Large large=(a,b)->
		{
			if(a>b)
				return a;
			else
				return b;
		};
		System.out.println("Largest = "+large.findLargest(4, 10));
		
	}

}
