package com.example.demo._04PredefinedBiFunctionalInterfaces._01BiPredicate;

/**
 * Notes :
 * 1. Difference between 'Predicate' and 'BiPredicate' is, 'Predicate' can take one argument where as 'BiPredicate' can take two
 * 2. Everything else (methods and all) are same as 'Predicate'
 */

import java.util.function.BiPredicate;

/**
 * @author Mahesh
 */
public class _01BiPredicateBasics {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Create a 'BiPredicate' to check if sum of two inetgers is even or not
		 */
		BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> ((num1 + num2) % 2 == 0);

		System.out.println(isSumEven.test(10, 11));
		System.out.println(isSumEven.test(10, 20));
	}
}
