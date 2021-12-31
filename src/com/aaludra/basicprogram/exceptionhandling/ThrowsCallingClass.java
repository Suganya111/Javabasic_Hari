package com.aaludra.basicprogram.exceptionhandling;

import java.util.InputMismatchException;

public class ThrowsCallingClass {

	public static void main(String[] args) {

		ThrowsDemo obj = new ThrowsDemo();
		try {
			obj.arithmeticoperation();

		} catch (InputMismatchException e) {
			System.err.println("Please enter valid input ");
			obj.arithmeticoperation();

		} catch (ArithmeticException e) {
			System.err.println("RE-CHECK your input");
			obj.arithmeticoperation();

		} catch (Exception e) {
			System.out.println("12");

		}
	}
}
