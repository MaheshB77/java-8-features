package com.example.demo._04PredefinedBiFunctionalInterfaces._02BiFunction;

/**
 * Notes :
 * 1. 'BiFunction' can take two inputs as compared to 'Function' which can take only one input
 * 2. 'BiFunction<T, U, R>' where 'T' & 'U' are inputs and 'R' is output
 */

import java.util.function.BiFunction;

/**
 * @author Mahesh
 */
public class _01BiFunctionBasics {
	public static void main(String[] args) {
		/**
		 * Create a 'BiFunction' that takes two strings and returns length of both string combined
		 */
		BiFunction<String, String, Integer> b = (str1, str2) -> (str1 + str2).length();

		System.out.println(b.apply("Mahesh", "Bansode"));
		System.out.println(b.apply("Java", "TypeScript"));
		System.out.println(b.apply("Rust", "GoLang"));
	}
}
