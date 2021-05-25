package com.example.demo._08DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Mahesh
 */
public class _01LocalDateBasics {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Day : " + date.getDayOfMonth());
		System.out.println("Month : " + date.getMonthValue());
		System.out.println("Year : " + date.getYear());

		LocalTime time = LocalTime.now();
		System.out.println("Hour : " + time.getHour());
		System.out.println("Minute : " + time.getMinute());
		System.out.println("Seconds : " + time.getSecond());
		System.out.println("Nano sec : " + time.getNano());
	}
}
