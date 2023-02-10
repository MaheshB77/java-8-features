package com.example.demo._07Streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Notes :
 * - Filter method is used to filter the collection based on some condition
 */
public class _10FilterMethod {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 1, 8, 2, 9, 3);
        List<Integer> evenNumbers = list
                .stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
