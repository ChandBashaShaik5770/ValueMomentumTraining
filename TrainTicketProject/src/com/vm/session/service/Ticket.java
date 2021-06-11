package com.vm.session.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.vm.session.bean.Passenger;
import com.vm.session.bean.Train;


public class Ticket 
{
	private int counter;
	private String pnr;
	private LocalDate travelDate;
	private Train train;
	static int count=100;
	private static TreeMap<Passenger,Double> passengers=new TreeMap<Passenger,Double>();
	
	public Ticket() {
		super();
	}

	public Ticket(LocalDate travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
		
	}
 
	 private String generatePNR()
	{
        
		String str[]=travelDate.toString().split("-");
		train.getSource();
		train.getDestination();
		String string=train.getSource().charAt(0)+""+train.getDestination().charAt(0);
		string=string+""+str[0]+str[1]+str[2]+""+count;
		count++;
       return string;
	}
	
	 
	 
	private Double calcPassengerFare(Passenger passenger)
	{
		System.out.println(travelDate);
		double ticket=train.getTicketPrice();
		
		if(passenger.getAge()<=12)
		{
			ticket= (double) (ticket/2);
		}
		
		else if(passenger.getAge()>=60)
		{
			ticket=	0.6*ticket;	
		}
		if(passenger.getGender()=='f' || passenger.getGender()=='F')
		{
				ticket=	0.75*ticket;
		}
		return ticket;
	}
	public void addPassenger(String str,int i,char ch)
	{
		
		Passenger passenger=new Passenger(str,i,ch);
		passengers.put(passenger,calcPassengerFare(passenger));
		
	}
  
	private double calculateTotalTicketPrice()
	{
		double totalprice=0.0;
		
		for(Double price:passengers.values())
		{
			totalprice+=price;
		}
		return totalprice;
	}
	private StringBuilder generateTicket()
	{
		
		StringBuilder ticket=new StringBuilder(generatePNR());
		return ticket;
	}
	public void writeTicket() throws IOException
	{
	
		String s=generatePNR();
		
		File f = new File(s+".txt");
		FileWriter fr = new FileWriter(f,true);
		BufferedWriter br = new BufferedWriter(fr);
		System.out.println("Ticket Booked with PNR : "+generatePNR());
		br.write("PNR \t\t    "+generatePNR()+"\n");
		br.write("Train no\t\t"+train.getTrainNo()+"\n");
		br.write("Train Name\t\t"+train.getTrainName()+"\n");
		br.write("From\t\t"+train.getSource()+"\n");
		br.write("To\t\t"+train.getDestination()+"\n");
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String travelDateString=String.valueOf(travelDate.format(dtf));
		br.write("Travel Date\t    "+travelDateString+"\n");
		br.newLine();
		br.write("Passengers\n");
		br.write("Name\t\tAge\t\tGender\t\tFare"+"\n");
		for (Entry<Passenger, Double> entry : passengers.entrySet()) {
	       
	         br.write(entry.getKey().getName()+"\t\t"+
	         entry.getKey().getAge()+"\t\t"+entry.getKey().getGender()+"\t\t"+entry.getValue() );
	         br.newLine();
		}
		br.write("Total Price : "+calculateTotalTicketPrice());
		br.flush();
		br.close();
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	}


