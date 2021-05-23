package com.example.demo._03PredefinedFunctionalInterfaces._04Supplier;

/**
 * Notes :
 * 1. 'Supplier' contains abstract method called 'get()'
 * 2. 'get()' won't accept any argument, but always return something
 * 3. 'Supplier' does not contain any default or static methods
 */

import java.util.Date;
import java.util.function.Supplier;

/**
 * @author Mahesh
 */
public class _01SupplierBasics {
	public static void main(String[] args) {
		/**
		 * Problem :
		 * Write a supplier to supply system date
		 */
		Supplier<Date> date = () -> new Date();
		System.out.println(date.get());

		/**
		 * Problem :
		 * Write a supplier to generate random name
		 */
		Supplier<String> randomName = () -> {
			String[] names = {"Mahesh", "Kiran", "Ricky", "Shaan", "Zara"};
			int randomIndex = (int) (Math.random() * 4);
			return names[randomIndex];
		};
		System.out.println(randomName.get());
		System.out.println(randomName.get());
	}
}
