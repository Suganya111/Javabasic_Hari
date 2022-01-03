package com.aaludra.basicprogram.revision;

import java.util.Scanner;

public class Whileloop7 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();

		while (number >= 0) {
			sum += number;
			System.out.println("Enter the number");
			number = sc.nextInt();

		}
		System.out.println("Addition of given positive numbers is " + sum);
		sc.close();
	}

}
