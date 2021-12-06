package com.aaludra.basicprogram;

public class Strings {

	public static void main(String[] args) {
		String main ="THIS IS THE SAMPLE STRING";
		String s1= "string";
		String s2= "STRING";
		String s3= "string operations";
		System.out.println("Alphabet at 4th position of the word string  =" + s1.charAt(3));
		System.out.println(" ");
		System.out.println("After concadination   "+ main.concat(" OPERATION"));
		System.out.println(" ");
		System.out.println("Ignorecase string operation  " + s2.equalsIgnoreCase("STRING") );
		System.out.println(" ");
		System.out.println("Length of 'string operation' is  =" + s3.length());
		System.out.println(" ");
		System.out.println("In main string replacing string with java " + main.replace("SAMPLE","JAVA"));
		System.out.println(" ");
		System.out.println("The substring 5 is" + main.substring(4));
		System.out.println(" ");
		System.out.println("The characters between 3 to 8  " + main.substring(2,9));
		System.out.println(" ");
		System.out.println("Converting lowercase to uppercase 'string' " + s1.toUpperCase());
		System.out.println(" ");
		System.out.println("Converting uppercase to lowercase 'STRING' " + s2.toLowerCase());
		System.out.println(" ");
		System.out.println("Adding strings without whitespase using trim()" + s2.trim()+ "operation");
		System.out.println(" ");
		System.out.println("search for string THE " + main.contains("THE"));
		System.out.println(" ");
	}

}
