package com.example.demo._03PredefinedFunctionalInterfaces._03Consumer;

/**
 * Notes :
 * 1. 'Consumer' has a default method called 'andThen()' for chaining
 */

import java.util.function.Consumer;

/**
 * @author Mahesh
 */
public class _03ConsumerChaining {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Create a program to print the string and then print its length
		 */

		Consumer<String> printer = (str) -> System.out.println(str);
		Consumer<String> lengthChecker = (str) -> System.out.println(str.length());

		printer.andThen(lengthChecker).accept("Java TypeScript C++");

	}
}
