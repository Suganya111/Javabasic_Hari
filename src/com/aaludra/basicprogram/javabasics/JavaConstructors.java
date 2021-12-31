package com.aaludra.basicprogram.javabasics;

public class JavaConstructors {

	public JavaConstructors(String s, int i) {
		int c = i;
		String d = s;
		System.out.println(d + "\n " + c);

	}

	public static void main(String[] args) {

		new JavaConstructors("welcome to java constructor", 5);

	}

}
