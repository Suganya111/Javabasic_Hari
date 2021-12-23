package com.aaludra.basicprogram;

import java.util.Scanner;

public class TryandCatchExcample {

	Scanner sc = new Scanner(System.in);

	public void divide() {
		System.out.println("Enter two numbers to divide : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		try {
			int num3 = num1 / num2;
			System.out.println("Result is : " + num3);

		} catch (Exception e) {
			System.err.println("Oops! num2 is 0, enter valid number again :) ");
			divide();// the method will be called until when there is no error
		}
	}

	public void add() {

		try {
			System.out.println("Enter number for addition ");
			int ad1 = sc.nextInt();
			int ad2 = sc.nextInt();
			int ad3 = ad1 + ad2;
			System.out.println("Addition is : " + ad3);

		} catch (Exception e) {
			System.out.println("Exception happend");

		}
	}

	public static void main(String[] args) {
		TryandCatchExcample obj = new TryandCatchExcample();
		obj.divide();
		obj.add();
		System.out.println("End of program");// if error occures this line will not execute

	}

}
