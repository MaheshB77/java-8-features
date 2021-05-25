package com.example.demo._08DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Mahesh
 */
public class _01LocalDateBasics {
	public static void main(String[] args) {
//		LocalDate
		LocalDate date = LocalDate.now();
		System.out.println("Date : " + date);
		System.out.println("Day : " + date.getDayOfMonth());
		System.out.println("Month : " + date.getMonthValue());
		System.out.println("Year : " + date.getYear());

		System.out.println("--------------------");

//		LocalTime
		LocalTime time = LocalTime.now();
		System.out.println("Time : " + time);
		System.out.println("Hour : " + time.getHour());
		System.out.println("Minute : " + time.getMinute());
		System.out.println("Seconds : " + time.getSecond());
		System.out.println("Nano sec : " + time.getNano());

		System.out.println("--------------------");

//		LocalDateTime (We have all methods from 'LocalDate' & 'LocalTime' in the 'LocalDateTime')
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

		System.out.println("--------------------");

		/**
		 * Topic : LocalDateTime from given parameters
		 * We have 'LocalDateTime.of()' method, using which we can create 'LocalDateTime' object
		 * 'LocalDateTime.of()' is overloaded method with several options
		 * 'LocalDateTime.of(yyyy, mm, dd, hh, ss, nn)' these are the options for overloading
		 */

		LocalDateTime dt = LocalDateTime.of(1996, 6, 7, 0, 0);
		System.out.println("My birthday : " + dt);
		System.out.println("After 6 months : " + dt.plusMonths(6));
		System.out.println("Before 3 months : " + dt.minusMonths(3));
		System.out.println("After 15 days : " + dt.plusDays(15));
		System.out.println("Before 4 hours : " + dt.minusHours(4));
	}
}
