package com.example.demo._02Interfaces;

/**
 * @author Mahesh
 * Static methods with interfaces
 */
public class _06StaticMethodsInInterface {

	public static void main(String[] args) {
		Interf1Impl obj = new Interf1Impl();
//		obj.m1();	// Not possible
//		Interf1Impl.m1();	// Not possible
		Interf1.m1();	// Possible
	}
}

interface Interf1 {
	public static void m1() {
		System.out.println("Implemented in interface Interf1");
	}
}

class Interf1Impl implements Interf1 {

}

/**
 * Notes :
 * 1. Overriding concept not available for static methods in interfaces
 */