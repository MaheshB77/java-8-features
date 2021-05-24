package com.example.demo._06MethodReference;

/**
 * Problem :
 * Write a program to implement multithreading using method reference
 */

/**
 * @author Mahesh
 */
public class _02MethodReferenceExample {
	public static void main(String[] args) {
		Runnable r = new _02MethodReferenceExample()::myRun;
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}

	public void myRun() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My thread");
		}
	}
}
