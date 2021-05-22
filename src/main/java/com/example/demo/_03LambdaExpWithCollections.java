package com.example.demo;

import java.util.*;

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

/**
 * @author Mahesh
 * TreeSet custom sorting using lambda expression
 */
class LambdaExpWithTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>((a, b) -> {
			return b.compareTo(a);
		});

		set.add(2);
		set.add(4);
		set.add(1);
		set.add(8);
		set.add(0);

		System.out.println(set);
	}
}

/**
 * @author Mahesh
 * TreeMap custom sorting using lambda expression
 */
class LambdaExpWithTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>((a, b) -> {
			return b.compareTo(a);
		});

		treeMap.put(3, "Mahesh");
		treeMap.put(9, "Dinesh");
		treeMap.put(1, "Atul");
		treeMap.put(11, "Bhumik");
		treeMap.put(7, "Mangal");

		System.out.println(treeMap);
	}
}