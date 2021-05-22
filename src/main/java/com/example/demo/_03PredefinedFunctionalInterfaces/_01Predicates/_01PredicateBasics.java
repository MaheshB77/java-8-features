package com.example.demo._03PredefinedFunctionalInterfaces._01Predicates;

import java.util.function.Predicate;


/**
 * Notes :
 * 1. Predicate is a functional interface
 * 2. Predicate has abstract method called 'test'
 * 3. 'test' method takes any object and returns boolean
 */

/**
 * @author Mahesh
 */
public class _01PredicateBasics {
	public static void main(String[] args) {
		Predicate<Integer> isEven = (num) -> (num % 2 == 0) ? true : false;

		System.out.println(isEven.test(11));
		System.out.println(isEven.test(30));
//		System.out.println(isEven.test("Mahesh"));	//	CE
	}
}
