package com.vm.session.multithreading;


class ProjectCall extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			System.out.println("Name = "+Thread.currentThread().getName()+" "+i);
		}
	}
}


class WorkingOnProject extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			System.out.println("Name = "+Thread.currentThread().getName()+" "+i);
		}
	}
}




public class JoinMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ProjectCall call = new ProjectCall();
		WorkingOnProject onProject = new WorkingOnProject();
		
		call.setName("Project Call");
		onProject.setName("On Call");
		
		call.start();
		call.join();
		
		onProject.start();
		
	}

}
