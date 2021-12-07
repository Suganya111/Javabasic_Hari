package com.aaludra.basicprogram;

public class JavaConstructors {
	int a;
	int b;

	public JavaConstructors(String s, int i) {
		int c=i;
		String d= s;
		System.out.println(c+"\n"+d);
		}
		
	

	public static void main(String[] args ) {
		
		JavaConstructors obj= new JavaConstructors("welcome to java constructor",5);
		

	}

}
