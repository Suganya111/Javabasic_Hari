package com.aaludra.basicprogram;

public class WhilReverse {

	public static void main(String[] args) {
		String[] arr = { "I", "R", "A", "H" };
		int i = arr.length - 1;
		while (i >= 0) {
			System.out.print(arr[i]);
			i--;

		}

	}

}