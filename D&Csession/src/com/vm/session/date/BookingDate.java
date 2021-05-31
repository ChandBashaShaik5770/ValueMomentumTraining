package com.vm.session.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BookingDate {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s="dd/MMM/yyyy";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(s);
		System.out.println("Enter in foramt dd/MMM/yyyy ");
		String bookingDate=scanner.next();
		
        LocalDate l = LocalDate.parse(bookingDate,dtf);
        LocalDate today=LocalDate.now();
		
		
		if(l.isBefore(today))
			System.out.println("Booking not possible, check date");
		else
			System.out.println("Ticket Bookes Succesfully on Date "+bookingDate);
		
		
		
		
		
		
	}

}
