package com.example.demo._03PredefinedFunctionalInterfaces._01Predicates;

import java.util.*;
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
//		Predicate to check given number is even or not
		Predicate<Integer> isEven = (num) -> num % 2 == 0;
		System.out.println(isEven.test(11));
		System.out.println(isEven.test(30));

//		Predicate to check length of given string is greater than 5 or not
		Predicate<String> isGreater = (str) -> str.length() > 5;
		System.out.println(isGreater.test("Mahesh Bansode"));
		System.out.println(isGreater.test("Java"));

//		Predicate to check if given collection is empty or not
		Predicate<Collection> collection = Collection::isEmpty;
		List<Integer> list = Collections.emptyList();
		List<Integer> list1 = Arrays.asList(1, 4);
		System.out.println(collection.test(list));
		System.out.println(collection.test(list1));
	}
}
