package com.vm.session.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PeriodDemo {

	public static void main(String[] args) {

		LocalDate ld=LocalDate.now();
		LocalDate joiningdate = LocalDate.of(2021, 5, 5);
		
		Period period = Period.between(joiningdate, ld);
		System.out.println("year = "+period.getYears()+" Month = "+period.getMonths()+" Days = "+period.getDays());
		
		System.out.println("=========================");
		
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println("Enter Date of Birth as yyyy/MM/dd");
		String s=scanner.next();
		
		LocalDate date = LocalDate.parse(s,dtf);
		System.out.println("Birht Datte= "+date);
		
		
		LocalDate today=LocalDate.now();
		System.out.println("Todays date = "+today);
		//LocalDate birthDate = LocalDate.parse(da);
		
		Period period1 = Period.between(date, today);
		System.out.println("Year's = "+period1.getYears());
		

		
		
	}

}
