package com.example.demo._03PredefinedFunctionalInterfaces._01Predicates;

/**
 * Notes :
 * 1. Predicate has three default methods (and, or, negate)
 */

import java.util.function.Predicate;

/**
 * @author Mahesh
 */
public class _02PredicateJoining {
	public static void main(String[] args) {
//		Predicate to check given number is greater than 5 or not
		Predicate<Integer> isGreater = (num) -> (num > 5);

//		Predicate to check given number is even or not
		Predicate<Integer> isEven = (num) -> (num % 2 == 0);

//		We want to check if number is greater than 5 AND number is even
		Predicate<Integer> greaterAndEven = isGreater.and(isEven);
		System.out.println(greaterAndEven.test(10));
		System.out.println(greaterAndEven.test(7));

//		We want to check is number is greater than 5 OR number is even
		Predicate<Integer> greaterOrEven = isGreater.or(isEven);
		System.out.println(greaterOrEven.test(9));
		System.out.println(greaterOrEven.test(3));

//		We want to check if given number is odd or not
		Predicate<Integer> isOdd = isEven.negate();
		System.out.println(isOdd.test(7));
		System.out.println(isOdd.test(8));
	}
}
