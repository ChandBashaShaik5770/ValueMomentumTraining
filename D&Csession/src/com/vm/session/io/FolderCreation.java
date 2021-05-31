package com.vm.session.io;

import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File f = new File("C:\\Users\\Shaik Chand Basha\\Documents\\D&C Session\\Movies");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		
		
		
		
		
		
	}

}
