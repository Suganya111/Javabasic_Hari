package com.aaludra.basicprogram;

/*parameterized constructor 
 * give values and do arithmetic operations 
 * the value of the local object not used
 */
public class ConstructorsExample {
	public void cons() {
		// int a = 3;
		// int b = 4;
	}

	public ConstructorsExample(String s, int a, int b) {
		int c = a + b;
		String d = s;
		System.out.println(d + "\n " + c);

	}

	public static void main(String[] args) {
		new ConstructorsExample("welcome to java constructor", 5, 2);

	}

}
