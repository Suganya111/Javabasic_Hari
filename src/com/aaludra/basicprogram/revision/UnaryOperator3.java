package com.aaludra.basicprogram.revision;

public class UnaryOperator3 {

	public static void main(String[] args) {

		int a = 12, b = 12;
		int result1, result2, result3;

		System.out.println("Value of a: " + a);

		result1 = ++a;// increment operator
		System.out.println("After increment: " + result1);

		System.out.println("Value of b: " + b);

		result2 = --b; // decrement operator
		System.out.println("After decrement: " + result2);

		result3 = -a;// The unary negation operator (-) produces the negative of its operand.
		System.out.println(result3);// negation operator

	}

}
