package com.example.demo._02Interfaces;

/**
 * @author Mahesh
 */
public class _04DefaultMethodsInInterface {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.m1();
	}
}

//	Interface with 'default' method
interface Interf {
	default void m1() {
		System.out.println("Default implementation");
	}
}

class Demo implements Interf {

	//	We can use default implementation of m1() or we can also override m1()
	@Override
	public void m1() {
		System.out.println("Overridden implementation");
	}
}