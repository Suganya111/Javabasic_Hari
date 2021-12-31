package com.aaludra.basicprogram.exceptionhandling;

import java.util.Scanner;

@SuppressWarnings("serial")
public class WrongpasswordException extends Exception {

	public void verifyPassword() throws WrongpasswordException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password" + "\nPassword must be at 9 to 14 characters");

		String pas = sc.nextLine();

		sc.close();

		if (pas.length() < 9 || pas.length() > 15) {

			throw new WrongpasswordException();

		} else {
			System.out.println("Valid password : " + pas);
		}

	}

}
