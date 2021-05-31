package com.vm.session.date;

import java.time.LocalDate;

public class DateCalculation {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Today = "+today);
		System.out.println("Next Day = "+today.plusDays(1));
		System.out.println("After two weeks = "+today.plusWeeks(2));
		System.out.println("Next Month = "+today.plusMonths(1));
		System.out.println("Next Year = "+today.plusYears(1));
		
		LocalDate bookingDate = LocalDate.of(2021, 05,30 );
		if(bookingDate.isAfter(today))
			System.out.println("Correct");
		else
			System.out.println("Invalid date");
		
		
		
		
		
		
		
		
	}

}
