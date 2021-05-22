package com.example.demo._03PredefinedFunctionalInterfaces._01Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Mahesh
 */
public class _03PredicateExample {
	public static void main(String[] args) {
//		Remove the null from String[]
		String[] arr = {"Mahesh", "Dinesh", null, "Swapnil", null, "Durga"};
		List<String> arr1 = new ArrayList<String>();

		Predicate<String> isNull = (str) -> str == null;

		for(String str : arr) {
			if(isNull.test(str)) {
				continue;
			} else {
				arr1.add(str);
			}
		}

		System.out.println(arr1);
	}
}
