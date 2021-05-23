package com.example.demo._03PredefinedFunctionalInterfaces._02Function;

/**
 * Notes :
 * 1. 'Function' interface contains two default methods (andThen() and compose())
 * 2. Consider we have two 'Function' lambda exp. 'f1' and 'f2'
 * 3. 'f1.andThen(f2)' in this case first 'f1' will be applied and then 'f2' will be applied
 * 4. 'f1.compose(f2)' in this case first 'f2' will be applied and then 'f1' will be applied
 */

import java.util.function.Function;

/**
 * @author Mahesh
 */
public class _05FunctionChaining {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * 1. Convert given string into uppercase, and then
		 * 2. Cut (substring()) first 9 characters of that string
		 */

		Function<String, String> f1 = (str) -> str.toUpperCase();
		Function<String, String> f2 = (str) -> str.substring(0, 9);

		String result = f1.andThen(f2).apply("maheshbansode");
		System.out.println(result);

		/**
		 * Difference between 'andThen()' and 'compose()'
		 * (They are opposite to each other)
		 */
		Function<Integer, Integer> add = (num) -> num + num;
		Function<Integer, Integer> cube = (num) -> num * num * num;

		Integer andThenResult = add.andThen(cube).apply(2);
		Integer composeResult = add.compose(cube).apply(2);

		System.out.println("andThen() : " + andThenResult);
		System.out.println("compose() : " + composeResult);
	}
}
