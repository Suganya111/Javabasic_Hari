package com.aaludra.basicprogram;

public class Singlinheritance extends Forinheritance {
	int m = 123;

	public static void main(String[] args) {
		Singlinheritance obj = new Singlinheritance();
		obj.does();
		System.out.println(" ");
		System.out.println(obj.b + ":  This is char value");
		System.out.println(" ");
		System.out.println(obj.f + ":  This is float value");
		System.out.println(" ");
		System.out.println(obj.s + ":  This is string value");
	}

}
