package com.aaludra.basicprogram.exceptionhandling;

public class WrongpasswordExceptionmain {

	public static void main(String[] args) {
		WrongpasswordException obj = new WrongpasswordException();
		try {
			obj.verifyPassword();

		} catch (WrongpasswordException e) {

			System.err.println("Invalid password");

		} finally {
			System.out.println("Finally block will be called even if the exception occure or not ");
		}
	}
}
