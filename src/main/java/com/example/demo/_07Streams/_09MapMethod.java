package com.example.demo._07Streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Notes :
 * - Map method is used to transform elements in the collection
 */
public class _09MapMethod {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 1, 8, 4, 5);
        List<Integer> integers = list.stream().map(num -> {
            if (num > 5) {
                return num * 2;
            } else {
                return num;
            }
        }).collect(Collectors.toList());
        System.out.println(integers);
    }
}
