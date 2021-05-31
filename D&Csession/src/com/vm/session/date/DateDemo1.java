package com.vm.session.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 
{
	public static void main(String[] args) 
	{
		LocalDate todayDate=LocalDate.now();
		System.out.println("date = "+todayDate);
		
		System.out.println("Local time = "+LocalDateTime.now());
		
		
		System.out.println("day of the year = "+todayDate.getDayOfYear());
		System.out.println("Month of the day = "+todayDate.getDayOfMonth());
		System.out.println("day of the week = "+todayDate.getDayOfWeek());
		
		
		
	}

}
