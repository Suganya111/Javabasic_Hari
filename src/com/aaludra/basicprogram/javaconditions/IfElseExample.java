package com.aaludra.basicprogram.javaconditions;

public class IfElseExample {
	/*
	 * System.out.println statements are not correct
	 * 
	 */
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		// int c = 20;
		if (a == b) {
			System.out.println("a is equal to b");
		} else if (b <= a) {
			System.out.println(" B is less than or equals to a");
		} else if (b >= a) {
			System.out.println("A equals to b");
		} else {
			System.out.println("");
		}

	}
}
