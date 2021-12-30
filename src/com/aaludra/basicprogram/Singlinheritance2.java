package com.aaludra.basicprogram;

/* \n use for new line
 */
public class Singlinheritance2 extends SingleInheritance1 {
	int m = 123;

	public static void main(String[] args) {
		Singlinheritance2 obj = new Singlinheritance2();
		obj.does();
		System.out.println(" ");
		System.out.println(obj.b + ":  This is char value");
		System.out.println(" ");
		System.out.println(obj.f + ":  This is float value");
		System.out.println(" ");
		System.out.println(obj.s + ":  This is string value");
	}

}
