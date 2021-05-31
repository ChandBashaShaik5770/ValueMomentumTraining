

package com.vm.training.oops.assignment;

public class KeyBoardMain 
{
	public static void main(String[] args) {
		Dell dell=new Dell("Dell","Inspiron","8GB","1TB","Intel","50");
		System.out.println(dell);
		Asus asus = new Asus("Asus","Inspiron","8GB","1TB","Intel","60*50");
		System.out.println(asus);
		asus.keys();
		
		
		
	}

}
