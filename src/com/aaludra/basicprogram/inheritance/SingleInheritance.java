package com.aaludra.basicprogram.inheritance;

/* declared unused variable
 * valid to specify proper class name
 */
public class SingleInheritance {
	int a;
	int b;
	// int i = 90;

	public SingleInheritance(int b, int a) {
		this.a = a;
		this.b = b;
		int c = a * b;
		System.out.println("Multiplication of " + a + " and " + b + " is : " + c);
	}
}
