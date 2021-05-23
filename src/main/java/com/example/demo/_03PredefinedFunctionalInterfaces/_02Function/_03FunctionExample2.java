package com.example.demo._03PredefinedFunctionalInterfaces._02Function;

/**
 * Problem :
 * Write a program to calculate total salary of all employees
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Mahesh
 */
public class _03FunctionExample2 {
	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();

		Function<List<Employee>, Integer> totalSalary = (emp) -> {
			Integer totalSal = 0;
			for (Employee employee : emp) {
				totalSal += employee.salary;
			}
			return totalSal;
		};

		System.out.println("Total salary of all employees is : " + totalSalary.apply(employees));
	}
}

class Employee {
	String name;
	Integer salary;

	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	public static List<Employee> getEmployees() {
		return Arrays.asList(
				new Employee("Mahesh", 20000),
				new Employee("Dinesh", 30000),
				new Employee("Sanjay", 25000),
				new Employee("Mitesh", 40000),
				new Employee("Rahul", 50000)
		);
	}
}