package com.aaludra.basicprogram;

/* the value of the local variable obj is not used*
 * its valid to specify proper class name*/
public class SingleInheritance2 extends SingleInheritance1 {

	public SingleInheritance2(int b, int a) {
		super();
		int c = a + b;
		System.out.println("Addition of " + a + " and " + b + " : " + c);
	}

	public static void main(String[] args) {
		new SingleInheritance2(23, 56);

	}

}
