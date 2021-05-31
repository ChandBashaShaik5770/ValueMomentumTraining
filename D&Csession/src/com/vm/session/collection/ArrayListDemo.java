package com.vm.session.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> javabatch = new ArrayList<String>();
		javabatch.add("ravi");
		javabatch.add("john");
		javabatch.add("anil");
		javabatch.add("kumar");
		
		
		ArrayList<String> sqlbatch = new ArrayList<String>();
		sqlbatch.add("sourab");
		sqlbatch.add("ankita");
		sqlbatch.add("john");
		sqlbatch.add("kumar");
		sqlbatch.add("manoj");
		
		
		/*javabatch.removeAll(sqlbatch);
		 * javabatch.addAll(sqlbatch);
		Collections.sort(javabatch);
		System.out.println("After Sorting Java Batch : "+javabatch);*/
		
		sqlbatch.removeAll(javabatch);
		sqlbatch.addAll(javabatch);
		Collections.sort(sqlbatch);
		System.out.println("After Sorting SQL Batch : "+sqlbatch);
		
		
		
		
	}

}
