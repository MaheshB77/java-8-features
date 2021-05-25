package com.example.demo._07Streams;

/**
 * Notes :
 * 1. 'collect()' method collects the objects from stream and add to the specified collection
 * 2. 'collect()' method can be used with 'filter()' and 'map()'
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mahesh
 */
public class _02CollectMethod {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Write a program to filter out the strings from the list which contains length >=9
		 */

		List<String> list = Arrays.asList(
				"Java",
				"TypeScript",
				"Roby on Rails",
				"Angular"
		);
		List<String> list2 = list.stream().filter(str -> str.length() >= 9).collect(Collectors.toList());
		System.out.println(list2);
	}
}
