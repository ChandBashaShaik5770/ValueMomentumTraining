package com.vm.session.newFeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class InBuiltFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> p=(var)->var.startsWith("b");
		System.out.println(p.test("abcd"));
		
		Function<String, String> f1=(f2)->f2.concat(" Hello Welcome");
		System.out.println(f1.apply("Sachin"));
		
		Function<String, Integer> f3=(f4)->f4.length();
		System.out.println(f3.apply("Sachin"));
	}

}
