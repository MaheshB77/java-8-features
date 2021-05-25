package com.example.demo._07Streams;

/**
 * Notes :
 * 1. 'toArray()' copies elements of stream and creates new array
 */

import java.util.Arrays;
import java.util.List;

/**
 * @author Mahesh
 */
public class _07ToArrayMethod {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Create an array of string from ArrayList<String>
		 */

		List<String> list = Arrays.asList("Java", "TypeScript", "Python", "JavaScript", "C#");
		String[] strArray = list.stream().toArray(String[]::new);    // Where String[]::new is a constructor reference

		for (String s : strArray)
			System.out.println(s);
	
	}
}
