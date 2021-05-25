package com.example.demo._08DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Mahesh
 */
public class _01LocalDateBasics {
	public static void main(String[] args) {
//		Date
		LocalDate date = LocalDate.now();
		System.out.println("Date : " + date);
		System.out.println("Day : " + date.getDayOfMonth());
		System.out.println("Month : " + date.getMonthValue());
		System.out.println("Year : " + date.getYear());

		System.out.println("--------------------");

//		Time
		LocalTime time = LocalTime.now();
		System.out.println("Time : " + time);
		System.out.println("Hour : " + time.getHour());
		System.out.println("Minute : " + time.getMinute());
		System.out.println("Seconds : " + time.getSecond());
		System.out.println("Nano sec : " + time.getNano());

		System.out.println("--------------------");

//		DateTime (We have all methods from 'LocalDate' & 'LocalTime' in the 'LocalDateTime')
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("DateTime : " + dateTime);
		System.out.println("Date : " + dateTime.toLocalDate());
		System.out.println("Time : " + dateTime.toLocalTime());
		System.out.println("Day : " + dateTime.getDayOfMonth());
		System.out.println("Month : " + dateTime.getMonthValue());
		System.out.println("Year : " + dateTime.getYear());
		System.out.println("Hour : " + dateTime.getHour());
		System.out.println("Minute : " + dateTime.getMinute());
		System.out.println("Seconds : " + dateTime.getSecond());
		System.out.println("Nano sec : " + dateTime.getNano());
	}
}
