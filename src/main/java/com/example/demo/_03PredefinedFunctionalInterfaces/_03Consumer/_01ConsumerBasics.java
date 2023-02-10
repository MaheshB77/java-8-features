package com.example.demo._03PredefinedFunctionalInterfaces._03Consumer;

/**
 * Notes :
 * 1. 'Consumer' contains abstract method called 'accept(T t)'
 * 2. It does not return anything
 * 3. It only accepts data and process that data
 */

import java.util.function.Consumer;

/**
 * @author Mahesh
 */
public class _01ConsumerBasics {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Create a consumer which accepts a string and simply prints it
		 */

		Consumer<String> printer = (str) -> System.out.println(str);

		printer.accept("Mahesh Bansode");
		printer.accept("Java Kotlin Python TypeScript");
	}
}
