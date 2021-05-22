package com.example.demo._03PredefinedFunctionalInterfaces._01Predicates;

import java.util.function.Predicate;

/**
 * @author Mahesh
 */
public class _04PredicateIsEqualMethod {
	public static void main(String[] args) {
//		Checking equality of two objects using 'Predicate.isEqual' method

		Employee emp = new Employee("Mahesh", 25);
		Employee emp2 = new Employee("Dinesh", 22);
		Employee emp3 = new Employee("Mahesh", 25);

		Predicate<Employee> isMahesh = Predicate.isEqual(emp);
		System.out.println(isMahesh.test(emp2));
		System.out.println(isMahesh.test(emp3));
	}
}

class Employee {
	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Employee newEmp = (Employee) obj;

		if (obj instanceof Employee) {
			return newEmp.age == this.age && newEmp.name.equals(this.name);
		} else {
			return false;
		}
	}
}