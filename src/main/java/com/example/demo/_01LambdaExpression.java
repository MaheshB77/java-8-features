package com.example.demo;

//	To use lambda function we need to create an
//	functional interface (interface that contains only one abstract method)
//	functional interface may take any no. of default or static methods
@FunctionalInterface
interface _01Lambda {
	public int add(int num1, int num2);
}

public class _01LambdaExpression {
	public static void main(String[] args) {
//		1st way
//		_01Lambda obj = (int a, int b) -> {
//			return a + b;
//		};
//		obj.add(10, 15);

//		2nd way
//		_01Lambda obj = (int a, int b) -> a + b;
//		obj.add(10, 15);

//		3rd way
		_01Lambda obj = (a, b) -> a + b;
		obj.add(10, 15);

	}
}
