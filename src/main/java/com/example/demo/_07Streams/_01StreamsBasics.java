package com.example.demo._07Streams;

/**
 * Notes :
 * 1. To process the Collection objects we can use 'Streams'
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mahesh
 */
public class _01StreamsBasics {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Write a program to seperate the even numbers from list
		 */

//		Without streams (Until 1.7V)
		List<Integer> list = Arrays.asList(2, 5, 6, 9, 10, 15);
		List<Integer> evenNumbers = new ArrayList<Integer>();
		for (Integer num : list) {
			if (num % 2 == 0) {
				evenNumbers.add(num);
			}
		}
		System.out.println("Even numbers : " + evenNumbers);

//		With streams (After 1.8V)
		List<Integer> list2 = Arrays.asList(2, 5, 6, 9, 10, 15);
		List<Integer> evenNumbers2 = list2.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers : " + evenNumbers2);
	}
}
