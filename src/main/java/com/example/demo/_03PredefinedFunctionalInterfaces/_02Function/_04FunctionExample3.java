package com.example.demo._03PredefinedFunctionalInterfaces._02Function;

/**
 * Problem :
 * Write a program to increase the salary of employee whose salary is less than 3500 by 450
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Mahesh
 */
public class _04FunctionExample3 {
	public static void main(String[] args) {
		List<Employee2> employees = Employee2.getEmployees();

		Function<List<Employee2>, List<Employee2>> updateSal = (empList) -> {
			List<Employee2> updatedEmployees = new ArrayList<Employee2>();
			for (Employee2 emp : empList) {
				if (emp.salary < 3500) {
					emp.salary += 450;
				}
				updatedEmployees.add(emp);
			}
			return updatedEmployees;
		};

		System.out.println("Employees before increment : " + employees);
		System.out.println("Employees after increment : " + updateSal.apply(employees));
	}
}

class Employee2 {
	String name;
	Integer salary;

	public Employee2(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	public static List<Employee2> getEmployees() {
		return Arrays.asList(
				new Employee2("Mahesh", 2500),
				new Employee2("Dinesh", 4500),
				new Employee2("Swapnil", 1500),
				new Employee2("Akash", 7500),
				new Employee2("Durga", 4000)
		);
	}

	@Override
	public String toString() {
		return "Employee2{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				'}';
	}
}