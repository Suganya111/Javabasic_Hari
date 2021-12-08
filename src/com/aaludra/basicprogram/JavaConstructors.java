package com.aaludra.basicprogram;

public class JavaConstructors {
	int a =3;
	int b =4; 
	

	public JavaConstructors(String s, int i) {
		int c=i;
		String d= s;
		System.out.println(d + "\n " + c);

		}
	
	public static void main(String[] args ) {
		
		JavaConstructors obj = new JavaConstructors("welcome to java constructor",5);
		

	}

}
