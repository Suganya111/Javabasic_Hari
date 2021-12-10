package com.aaludra.basicprogram;

public class ChildClass extends BaseClass {

	public ChildClass(int b, int a) {
		super(b, a);
		int c = a + b;
		System.out.println("Addition of " + a + " and " + b + " : " + c);
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass(23, 56);
	}

}
