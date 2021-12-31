package com.aaludra.basicprogram.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {
	public void arithmeticoperation() throws ArithmeticException, InputMismatchException {
		// code that may produce above exceptions

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c = a / b;
		System.out.println(c);
		arithmeticoperation();
		sc.close();

	}
}
