package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Mahesh
 * Comparator without lambda expression
 */
//class MyComparator implements Comparator<Integer> {
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		return o2.compareTo(o1);
//	}
//}
//
//public class _03LambdaExpWithCollections {
//	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//
//		list.add(2);
//		list.add(4);
//		list.add(1);
//		list.add(8);
//		list.add(0);
//
//		list.sort(new MyComparator());	// or Collcetions.sort(list, new MyComparator());
//		System.out.println(list);
//	}
//}

/**
 * @author Mahesh
 * Comparator with lambda expression
 */
public class _03LambdaExpWithCollections {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(4);
		list.add(1);
		list.add(8);
		list.add(0);

		list.sort((Integer a, Integer b) -> b.compareTo(a));	//	list.sort((a, b) -> b.compareTo(a));
		System.out.println(list);
	}
}