package com.aaludra.basicprogram.revision;

import java.util.Scanner;

public class Ifcondition5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ");
		int i = sc.nextInt();
		if (i > 18) {
			System.out.println("Elegible to enter");
		}
		sc.close();
	}

}
