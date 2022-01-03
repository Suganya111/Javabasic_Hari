package com.aaludra.basicprogram.revision;

import java.util.Scanner;

public class NestedifCondition5 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();

		System.out.println("Enter the weight ");
		int we = sc.nextInt();

		if ((age >= 18) && (age <= 65)) {

			if (we == 40) {
				System.out.println("Please consult with your doctor");
			} else if ((we >= 41) && (we <= 75)) {
				System.out.println("You can donate blood");
			} else if ((we > 76) && (we <= 89)) {
				System.out.println("Please take health check up and consult with doctor");
			} else if ((we <= 39) || (we >= 90)) {

				System.out.println("Sorry your can't denote blood");
			}

		} else if ((age < 18) && (age >= 10))

		{
			System.out.println("You are not elegible to denote blood");
		} else {
			System.out.println("Invalid age");
		}
		sc.close();
	}

	public static void main(String[] args) {

		NestedifCondition5 obj = new NestedifCondition5();

		obj.run();
	}

}
