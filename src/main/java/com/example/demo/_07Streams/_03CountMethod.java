package com.example.demo._07Streams;

/**
 * Notes :
 * 1. 'count()' method is used to count the elements present in stream
 */

import java.util.Arrays;
import java.util.List;

/**
 * @author Mahesh
 */
public class _03CountMethod {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Write a program to count the even numbers in the list
		 */
		List<Integer> numbers = Arrays.asList(10, 3, 6, 7, 11, 4, 8);
		Long evenNumbers = numbers.stream().filter(num -> num % 2 == 0).count();
		System.out.println(evenNumbers + " even numbers present in the list");
	}
}
