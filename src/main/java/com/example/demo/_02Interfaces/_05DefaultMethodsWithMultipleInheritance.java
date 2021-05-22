package com.example.demo._02Interfaces;

/**
 * @author Mahesh
 */
public class _05DefaultMethodsWithMultipleInheritance {
	public static void main(String[] args) {
		LeftRightImpl obj = new LeftRightImpl();
		obj.m1();
	}
}


interface Left {
	default void m1() {
		System.out.println("Left implemantation");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right implemenation");
	}
}

class LeftRightImpl implements Left, Right {

	//	If we dont override then we will get an error
	//	i.e In this case we must override the default method
	@Override
	public void m1() {
		System.out.println("Overriden implementation");

//		If we want default implementation of 'Left' interface
//		Left.super.m1();

//		If we want default implementation of 'Right' interface
//		Right.super.m1();

	}
}