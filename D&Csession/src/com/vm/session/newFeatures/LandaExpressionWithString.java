package com.vm.session.newFeatures;


interface FindLength
{
	int find(String name);
}

interface Reverse
{
	String reverse(String name);
}



public class LandaExpressionWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindLength fl=(name)->name.length();
		System.out.println("Length of name = "+fl.find("chand"));
		
		Reverse rev=(name)->
		{
			StringBuffer sb=new StringBuffer(name);
			sb=sb.reverse();
			String s=sb.toString();
			return s;
		};
		System.out.println("Reversed string = "+rev.reverse("shaik"));
		
		

	}

}
