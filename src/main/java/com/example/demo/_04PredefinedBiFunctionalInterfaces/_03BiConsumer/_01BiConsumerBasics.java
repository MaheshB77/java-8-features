package com.example.demo._04PredefinedBiFunctionalInterfaces._03BiConsumer;

/**
 * Notes :
 * 'BiConsumer' takes two inputs where as 'Consumer' takes only one input
 * 'BiConsumer<T, U>' where 'T' & 'U' are inputs
 */

import java.util.function.BiConsumer;

/**
 * @author Mahesh
 */
public class _01BiConsumerBasics {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Write a BiConsumer which accepts two strings and prints the concatination of these strings
		 */
		BiConsumer<String, String> concat = (str1, str2) -> System.out.println(str1 + str2);

		concat.accept("Java", "TypeScript");
		concat.accept("Scala", "Ruby");
		concat.accept("React", "Angular");
		concat.accept("ExpressJs", "NestJs");
	}
}
