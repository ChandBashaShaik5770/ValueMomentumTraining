package com.vm.session.service;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import com.vm.session.bean.Passenger;
import com.vm.session.bean.Train;
import com.vm.session.dao.TrainDAO;

public class TicketApplication 
{

	private Train check(int n,TrainDAO tr)
	{
    
	    
	    Train train=tr.findTrain(n);
	    
	    if(train==null)
	    {
	    	System.out.println("Train with given train number doesn't exist in database");
	    	System.exit(1);
	    }
	    return train;
	}
	
	private boolean addPassengers(Ticket t,boolean bool)
	{
		Scanner sc=new Scanner(System.in);
		Passenger p;
		System.out.println("Enter Number of Passengers");
		int n=sc.nextInt();
		while(n>0)
		{
            
			System.out.println("Enter Passenger Name ");
			String name=sc.next();
			System.out.println("Enter Age ");
			int age=sc.nextInt();
			System.out.println("Enter Gender(M/F) ");
			char gender=sc.next().charAt(0);
			t.addPassenger(name, age, gender);
			n--;
			if(n==0)
			{
				bool=true;
			}
		}
		return bool;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
		
	
		//Checking Train  exists or not
		System.out.println("Enter the Train Number");
	    int number=sc.nextInt();
	    TrainDAO tr=new TrainDAO();
	    TicketApplication tc=new TicketApplication();
	    Train t=tc.check(number,tr);
	    
	    //Checking Travel date exists or not
	    LocalDate today=LocalDate.now();
		System.out.println("Enter the Travel date in format(yyyy-mm-dd)");
		String str=sc.next();
		LocalDate ld=LocalDate.parse(str);

		if(!ld.isAfter(today))
		{
			System.out.println("Travel Date is before current date");
			System.exit(1);
		}
	
		
		Ticket ticket=new Ticket(ld,t);
		boolean flag=false;
		flag=tc.addPassengers(ticket,flag);
		if(flag)
			ticket.writeTicket();
			
			
		//Adding Passengers
			
		
		
		
	    }
}
