package com.example.demo._08DateAndTime;

/**
 * Notes :
 * 1. 'ZoneId' is used to handle zones across the world
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Mahesh
 */
public class _03ZoneId {
	public static void main(String[] args) {

//		Get your current zone
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("Current zone is : " + currentZone);

//		Get zone of America and find current time in America
		ZoneId americanZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime americanDateTime = ZonedDateTime.now(americanZone);
		System.out.println("Current DateTime in America is : " + americanDateTime);
	}
}
