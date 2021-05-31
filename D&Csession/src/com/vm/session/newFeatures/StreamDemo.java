package com.vm.session.newFeatures;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {


		//List<Integer>l= Arrays.asList(2,1,3,5,7,8,9,4,6);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(5);
		num.add(7);
		num.add(8);
		num.add(3);
		num.add(6);
		
		
		
		//Same as System.out.println(num);
		num.forEach(s->System.out.println(s));
		//Same as System.out.println(num);
		System.out.println("====================");
		//num.forEach(System.out::println);
		long count = num.stream().count();
		System.out.println("Count = "+count);
		System.out.println("====================");
		System.out.println("To Get Numbers Grater than 5");
		num.stream().filter(s->s>5).forEach(s->System.out.println(s));
		System.out.println("====================");
		num.stream().map(s->s+100).forEach(s->System.out.println(s));
		
		
		
		
		
		
		
	}

}
