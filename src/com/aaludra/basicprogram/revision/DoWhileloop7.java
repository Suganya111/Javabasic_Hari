package com.aaludra.basicprogram.revision;

import java.util.Scanner;

public class DoWhileloop7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of natural number to be added");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		do {
			sum = sum + i;
			i++;

		} while (i <= n);
		System.out.println("The addition of first " + n + " natural numbers are " + sum);
		sc.close();
	}

}
