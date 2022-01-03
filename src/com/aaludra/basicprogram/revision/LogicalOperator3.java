package com.aaludra.basicprogram.revision;

public class LogicalOperator3 {

	public static void main(String[] args) {

		// && operator return true if both expression are true
		System.out.println((5 > 3) && (8 > 5)); // true
		System.out.println((5 > 3) && (8 < 5)); // false

		// || operator return true if one expression true
		System.out.println((5 < 3) || (8 > 5)); // true
		System.out.println((5 > 3) || (8 < 5)); // true
		System.out.println((5 < 3) || (8 < 5)); // false

		// ! operator true if the expression is false
		System.out.println(!(5 == 3)); // true
		System.out.println(!(5 > 3)); // false

	}

}
