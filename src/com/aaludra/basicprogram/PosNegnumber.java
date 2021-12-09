package com.aaludra.basicprogram;

import java.util.Arrays;

public class PosNegnumber {
	public static void main(String[] args) {
		int[] arr = { 4, -3, -4, 7, 9, -2, -4, -7, 1, 6 };
		System.out.println("Positive integers");

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > 0 || arr[i] == 0) {
				Arrays.sort(arr);
				System.out.println(arr[i]);
			}

		}
		System.out.println("Negative integers");
		System.out.println(" ");

		for (int j = 0; j <= arr.length - 1; j++) {
			if (arr[j] < 0) {
				Arrays.sort(arr);
				System.out.println(arr[j]);
			}
		}
	}
}
