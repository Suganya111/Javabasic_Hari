package com.aaludra.basicprogram.revision;

import java.util.Scanner;

public class IfelseifLadder5 {
	public void height() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your height");
		double d = sc.nextDouble();
		if ((d >= 5) && (d < 6)) {
			System.out.println("Average Height");

		} else if ((d > 3.5) && (d <= 5)) {
			System.out.println("Too short");
		} else if ((d >= 6.1) && (d < 7)) {
			System.out.println("Tall");
		} else if ((d >= 7.1) && (d <= 8.8)) {
			System.out.println("Very tall");
		} else {

			System.err.println("Invalid number");

		}
		sc.close();
	}

	public static void main(String[] args) {
		IfelseifLadder5 obj = new IfelseifLadder5();
		obj.height();

	}

}
