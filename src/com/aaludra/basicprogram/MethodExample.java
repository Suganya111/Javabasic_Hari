package com.aaludra.basicprogram;

/* valid to specify proper class name
 * declare meaningful method name
 */
public class MethodExample {
	public static void multi(int x) {
		if (x % 3 == 0) {
			System.out.println(x + " is multiples of 3");
		} else if (x % 2 == 0) {
			System.out.println(x + " is multiples of 2");
		}

		else {
			System.out.println(x + " is not multiples of 3 or 2");

		}
	}

	public static void main(String[] args) {
		multi(678);

	}

}
