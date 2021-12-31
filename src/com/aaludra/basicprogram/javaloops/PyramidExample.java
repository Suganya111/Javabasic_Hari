package com.aaludra.basicprogram.javaloops;

/* give a valid class name
 * 
 */
public class PyramidExample {

	public static void main(String[] args) {

		for (int i = 10; i > 0; i--) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
			} else

				for (int j = 10; j >= i; j--) {

					System.out.print(" " + i);

				}
			System.out.println();
		}
	}

}
