package com.aaludra.basicprogram.javaloops;
/* give proper class name
 * 
 */
public class WhilReverseExample {

	public static void main(String[] args) {

		String[] arr = { "I", "R", "A", "H" };

		int i = arr.length - 1;

		while (i >= 0) {
			System.out.print(arr[i]);
			i--;

		}

	}

}