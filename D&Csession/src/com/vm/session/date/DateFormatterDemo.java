package com.vm.session.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterDemo {

	public static void main(String[] args) {


		LocalDate today = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd - MMMM - yy E W M w");
		String afterFormat=today.format(dtf);
		System.out.println(afterFormat);
		
		String afterFormat2=today.format(dtf2);
		System.out.println(afterFormat2);
		
		
		
		DateTimeFormatter dtfull= DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtmedium= DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtshort= DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter dtlong= DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		
		
		String afterFormat3=today.format(dtfull);
		System.out.println("Full Date = "+afterFormat3);
		
		String afterFormat4=today.format(dtmedium);
		System.out.println("Medium Date = "+afterFormat4);
		
		String afterFormat5=today.format(dtshort);
		System.out.println("Short Date = "+afterFormat5);
		
		String afterFormat6=today.format(dtlong);
		System.out.println("Long Date = "+afterFormat6);
		
		
		
		
		
		
		
		
	}

}











/*
 * yy   ->   year in 2021         => 21
 * yyyy ->   2021
 * MM   ->   month in number      => 05
 * MMM  ->   month in character   => May
 * M    ->   Month in year        => jan-1, feb-2
 * W    ->   week of the year     => 4 i.e 4th week
 * w    ->   week of the year
 * E    ->   day of the week      => sat,fri....
 */
