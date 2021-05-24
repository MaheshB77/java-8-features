package com.example.demo._06MethodReference;

/**
 * Notes :
 * 1. We can refer a method to functional interface by using ::
 * 2. Method which is referencing the functional interface should have same arguments
 */

/**
 * @author Mahesh
 */
public class _01MethodReferenceBasics {
	public static void main(String[] args) {
//		Referencing static method
		Demo d = _01MethodReferenceBasics::m2;
		d.m1();

//		Referencing non-static method
		_01MethodReferenceBasics obj = new _01MethodReferenceBasics();
		Demo d2 = obj::m3;
		d2.m1();
	}

	public static void m2() {
		System.out.println("m2() implementation");
	}

	public void m3() {
		System.out.println("m3() implementation");
	}
}

@FunctionalInterface
interface Demo {
	public void m1();
}