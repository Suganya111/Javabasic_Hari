package com.aaludra.basicprogram;
/* give proper class name
 * 
 */
import java.util.Scanner;

public class ClassExample {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	private String name;
	private char ch;

	public static void main(String[] args) {
		// String s;
		System.out.println("This is java class");
		Scanner sn = new Scanner(System.in);

		System.out.println("Enter the text");
		String s = sn.nextLine();
		System.out.println("Entered text is " + s);
		sn.close();
	}

}
