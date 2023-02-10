package com.example.demo._07Streams;

/**
 * Notes :
 * 1. 'sorted()' method sorts the stream elements
 * 2. There are 2 'sorted()' methods
 * 3. 1st 'sorted()' sorts the elements based on default sorting
 * 4. 2nd 'sorted(Comparator c)' sorts the elements based on Comparator
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mahesh
 */
public class _04SortedMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 8, 1, 4, 9, 2);


//		Default sorting
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Default sorting (ascending) : " + sortedList);

//		Customized sorting
		List<Integer> sortedList2 = list.stream().sorted((num1, num2) -> num2.compareTo(num1)).collect(Collectors.toList());
		System.out.println("Custom sorting (descending) : " + sortedList2);
	}
}
