package com.example.demo._07Streams;

/**
 * Notes :
 * 1. This method does not return anything
 * 2. This method can take lambda expression as argument and apply that for each element present in Stream
 */

import java.util.Arrays;
import java.util.List;

/**
 * @author Mahesh
 */
public class _06ForEachMethod {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Print each element of list using stream
		 */
		List<Integer> list = Arrays.asList(5, 3, 9, 1, 8, 4);

		list.stream().forEach((num) -> System.out.println(num));
	}
}
