package com.vm.training.oops.assignment;

public class HierarchicalInheritance
{
	public static void main(String[] args) {
		Apple apple=new Apple();
		apple.sendMessage();
		apple.makeCall();
		Oppo oppo=new Oppo();
		oppo.makeCall();
		oppo.oppoConnect();
	}

}
