package com.aaludra.basicprogram.revision;

public class AssignmentOperator3 {

	public static void main(String[] args) {
		// create variables
		int a = 4;
		int ope;

		// assign value using =
		ope = a;
		System.out.println("var using =: " + ope);// a is 4 so ope also 4

		// assign value using =+
		ope += a;
		System.out.println("var using +=: " + ope);// ope is now 4 so += means 4+a so the ans will be 8

		// assign value using =*
		ope *= a;
		System.out.println("var using *=: " + ope);// *= means a=

	}

}
