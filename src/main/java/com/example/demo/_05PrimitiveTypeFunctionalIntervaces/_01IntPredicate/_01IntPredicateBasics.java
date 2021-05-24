package com.example.demo._05PrimitiveTypeFunctionalIntervaces._01IntPredicate;

/**
 * Notes :
 * 1. 'IntPredicate' is a special type of predicate which can accept only 'int' values
 * 2. It has abstract method called 'public boolean test(int value)'
 * 3. It has same other methods as 'Predicate' functional interface
 * 4. Similar to 'IntPredicate' we have 'LongPredicate' and 'DoublePredicate'
 */

import java.util.function.IntPredicate;

/**
 * @author Mahesh
 */
public class _01IntPredicateBasics {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Check the given number is even or not
		 */
		IntPredicate isEven = (num) -> num % 2 == 0;

		System.out.println(isEven.test(10));
		System.out.println(isEven.test(7));
//		System.out.println(isEven.test("Mahesh"));	// Not possible
	}
}
