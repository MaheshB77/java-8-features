package com.example.demo._01LambdaExpBasics;

//	Without lambda expression
//class MyThread implements Runnable {
//
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("My thread is running : " + i);
//		}
//	}
//}

public class _02LambdaExpressionWithRunnable {
	public static void main(String[] args) {
//		Without lambda expression
//		MyThread myThread = new MyThread();
//		Thread t1 = new Thread(myThread);
//		t1.start();
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main thread is running : " + i);
//		}

//		With lambda expression
		Runnable myThread = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("My thread is running : " + i);
			}
		};
		Thread t1 = new Thread(myThread);
		t1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread is running : " + i);
		}
	}
}
