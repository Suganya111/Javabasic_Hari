package com.aaludra.basicprogram;

/*valid to specify meaningful class name
 * \n use for new line
 */
import java.util.Arrays;

public class PositiveNegativeNumberExample {
	public static void main(String[] args) {
		int[] arr = { 4, -3, -4, 7, 13, 9, -2, -4, -5, -7, 1, 6, -22, -44 };
		System.out.println("Negative");
		System.out.println("");
		for (int i = 0; i <= arr.length - 1; i++) {
			Arrays.sort(arr);
			if (arr[i] < 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("");
		System.out.println("Positive");
		System.out.println("");

		for (int i = 0; i <= arr.length - 1; i++) {
			Arrays.sort(arr);
			if (arr[i] > 0) {
				System.out.println(arr[i]);
			}
		}

	}
}
