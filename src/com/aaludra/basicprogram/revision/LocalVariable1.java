package com.aaludra.basicprogram.revision;

/*
 * A variable declared inside the body of the method is called local variable. 
 * You can use this variable only within that method and the other methods
 * in the class aren't even aware that the variable exists.
 * A local variable cannot be defined with "static" keyword.
 */
public class LocalVariable1 {
	public void display(int b) {
		int a = 10;

		int c = a;
		int d = b + c;
		System.out.println(d);

	}

	public static void main(String[] args) {
		LocalVariable1 obj = new LocalVariable1();
		obj.display(100);

	}

}
