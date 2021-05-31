package com.vm.training.java.exception;

class Training
{
	void train() throws Exception
	{ 
		trainAllSubject();
		System.out.println("DotNet Zero Knowledge");
	}
	void trainAllSubject() throws Exception
	{
			System.out.println("Can train all subjects");
		}
	void specificTraining() throws Exception
	{
		train();
		System.out.println("Can train all only subjects");
	}
	
}


public class ThrowsTest 
{
	//This type of exception is handled by JVM
	public static void main(String[] args) throws Exception {
		
		Training training =new Training();
		training.specificTraining();
		
	}

}
