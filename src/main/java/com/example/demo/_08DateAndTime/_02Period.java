package com.example.demo._08DateAndTime;

/**
 * Notes :
 * 1. 'Period' is used to represent the quantity of time
 * 2. It can be used to get the period between two dates
 */

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Mahesh
 */
public class _02Period {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Find the years, months and days between birthdate and current date
		 */

		LocalDate birthday = LocalDate.of(1996, 6, 7);
		LocalDate today = LocalDate.now();

		Period p = Period.between(birthday, today);
		int years = p.getYears();
		int months = p.getMonths();
		int days = p.getDays();

		System.out.println("Your age is");
		System.out.println("Years : " + years + " , Months : " + months + " , Days : " + days);
	}
}
