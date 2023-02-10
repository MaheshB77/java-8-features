package com.example.demo._07Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Note :
 * map() is used for data transformation. ex => [1, 2, 3] => [1, 4, 6]
 * flatMap() is used for data transformation and to flatten the data
 * ex => [[1, 2], [3, 4], [5, 6]] => [1, 4, 6, 8, 10, 12]
 */
public class _11FlatMap {
    public static void main(String[] args) {
        List<Customer> customers = Customer.getAll();

        // Get emails of all customers (we can use map() here)
        List<String> emails = customers
                .stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);     // [john@gmail.com, smith@gmail.com, peter@gmail.com, kely@gmail.com]

        // Get phone numbers of all customers in one list (we can use flatMap() here)
        List<String> phoneNumbers = customers
                .stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);   // [397937955, 21654725, 89563865, 2487238947, 38946328654, 3286487236, 389246829364, 948609467]
    }
}

class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

    public Customer() {
    }

    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }
}