package com.example.demo._03PredefinedFunctionalInterfaces._02Function;

/**
 * Problem :
 * Find the grade of 'Student' based on marks, conditions given below
 * 1. 'Distinction' -> (marks >= 80 && marks <= 100)
 * 2. 'First' -> (marks >= 60 && marks < 80)
 * 3. 'Second' -> (marks >= 50 && marks < 60)
 * 4. 'Third' -> (marks >= 35 && marks < 50)
 * 5. 'Failed' -> (marks >= 0 && marks < 35)
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Mahesh
 */
public class _02FunctionExample {
	public static void main(String[] args) {
		List<Student> students = Student.getStudents();
		Function<Student, String> gradeChecker = (student) -> {
			Integer marks = student.marks;
			if (marks >= 80 && marks <= 100) {
				return "Distinction";
			} else if (marks >= 60 && marks < 80) {
				return "First";
			} else if (marks >= 50 && marks < 60) {
				return "Second";
			} else if (marks >= 35 && marks < 50) {
				return "Third";
			} else if (marks >= 0 && marks < 35) {
				return "Failed";
			} else {
				return "Invalid marks";
			}
		};

		for (Student student : students) {
			String grade = gradeChecker.apply(student);
			System.out.println("Grade of " + student.name + " is " + grade);
		}
	}
}

class Student {
	String name;
	Integer marks;

	public Student(String name, Integer marks) {
		this.name = name;
		this.marks = marks;
	}

	public static List<Student> getStudents() {
		return Arrays.asList(
				new Student("Mahesh", 91),
				new Student("Satoshi", 65),
				new Student("Dinesh", 85),
				new Student("Pramila", 88),
				new Student("Swapnil", 55),
				new Student("Ganesh", 41),
				new Student("Pratap", 30)
		);
	}
}