package com.example.demo._03PredefinedFunctionalInterfaces._02Function;

/**
 * Notes :
 * 1. Function interface looks like 'interface Function<T, R> {}'
 * 2. Where 'T' is input type and 'R' is output type
 * 3. It abstract method called 'R apply(T t)'
 */

import java.util.function.Function;

/**
 * @author Mahesh
 */
public class _01FunctionBasics {
	public static void main(String[] args) {
//		Check the length of given string
		Function<String, Integer> lengthChecker = (str) -> str.length();
		System.out.println(lengthChecker.apply("Mahesh"));
		System.out.println(lengthChecker.apply("Aishwarya"));
	}
}
