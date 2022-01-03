package com.aaludra.basicprogram.revision;

import java.util.Scanner;

public class SwitchStatement6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age to check your elegibility : ");
		int age = sc.nextInt();
		if ((age > 18) && (age <= 33)) {
			switch (age) {
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				System.out.println("You are not elegible to drive");
				break;
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
				System.out.println(" Welcome you are elegible to partticipate on race in first catagory ");
				break;
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 32:
			case 33:
				System.out.println("You are elegible to participate on race in second catagory");
				break;

			}
		} else {
			switch (age) {
			default:
				System.out.println("Sorry you are not elegible");
			}
		}

		sc.close();
	}

}
