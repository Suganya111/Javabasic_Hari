package com.aaludra.basicprogram;

public class BaseClass {
	int a;
	int b;
	int i = 90;

	public BaseClass(int b, int a) {
		this.a = a;
		this.b = b;
		int c = a * b;
		System.out.println("Multiplication of " + a + " and " + b + " is : " + c);
	}
}
