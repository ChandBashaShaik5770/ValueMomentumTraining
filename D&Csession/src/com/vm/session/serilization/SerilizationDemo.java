package com.vm.session.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Employee employee = new Employee(1, "Sam");
		employee.dept="hr";
		Employee employee1 = new Employee(2, "Sai");
		employee1.dept="pm";
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(employee);
		oos.writeObject(employee1);
		
		System.out.println("====Serilization Done====");
		
		
		
		
		
		
		
		
		
		
		
	}

}
