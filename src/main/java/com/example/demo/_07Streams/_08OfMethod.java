package com.example.demo._07Streams;

/**
 * Notes :
 * 1. We can create a Stream from a group of objects using 'Stream.of()' method
 * 2. We can create a Stream from an array of objects using 'Stream.of()' method
 */

import java.util.stream.Stream;

/**
 * @author Mahesh
 */
public class _08OfMethod {
	public static void main(String[] args) {
//		'Stream.Of()' method on group of objects
		Stream<Integer> stream = Stream.of(3, 7, 1, 8, 4);
		stream.forEach(System.out::println);    // stream.forEach((num) -> System.out.println(num));

//		'Stream.of()' method on array
		Double[] doubles = {10.4, 40.3, 28.4, 73.10};
		Stream<Double> stream1 = Stream.of(doubles);
		stream1.forEach(System.out::println);
	}
}
