package com.vm.session.serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e= (Employee)ois.readObject();
		Employee e1= (Employee)ois.readObject();
		
		System.out.println(e.id+" "+e.name+" "+e.dept);
		System.out.println(e1.id+" "+e1.name+" "+e1.dept);

	}

}
