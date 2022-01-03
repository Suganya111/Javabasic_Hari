package com.aaludra.basicprogram.revision;

/*
Java ternary operator is the only conditional operator that takes three operands.
It's a one-liner replacement for if-then-else statement and used a lot in Java programming.
 We can use the ternary operator in place of if-else conditions
 */
public class TernaryOperator3 {

	public static void main(String[] args) {
		int februaryDays = 28;
		String result;

		// ternary operator
		result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		System.out.println(result);

	}

}
