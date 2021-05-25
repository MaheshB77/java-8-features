package com.example.demo._07Streams;

/**
 * Notes :
 * 1. 'min(Comparator c)' method returns minimum value according to specified Comparator
 * 2. 'max(Comparator c)' method returns maximum value according to specified Comparator
 * 3. We have to use 'get()' method after min/max method to get the value
 */

import java.util.Arrays;
import java.util.List;

/**
 * @author Mahesh
 */
public class _05MinAndMaxMethods {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 9, 1, 8, 4);

		Integer minValue = list.stream().min((num1, num2) -> num1.compareTo(num2)).get();
		Integer maxValue = list.stream().max((num1, num2) -> num1.compareTo(num2)).get();

		System.out.println("Minimum value is : " + minValue);
		System.out.println("Maximum value is : " + maxValue);
	}
}
