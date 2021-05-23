package com.example.demo._03PredefinedFunctionalInterfaces._04Supplier;

/**
 * Problem :
 * Create a supplier that generates 6 digit unique OTP
 */

import java.util.function.Supplier;

/**
 * @author Mahesh
 */
public class _02SupplierExample {
	public static void main(String[] args) {
		Supplier<String> otp = () -> {
			String _otp = "";
			for(int i = 0; i < 6; i++) {
				_otp = _otp + ((int)(Math.random() * 10));
			}
			return _otp;
		};

		System.out.println(otp.get());
		System.out.println(otp.get());
		System.out.println(otp.get());
	}
}
