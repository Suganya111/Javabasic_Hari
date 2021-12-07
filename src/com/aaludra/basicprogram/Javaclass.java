package com.aaludra.basicprogram;

import java.util.Scanner;

public class Javaclass {

	public static void main(String[] args) {
		//String s;
		System.out.println("This is java class");
		Scanner sn= new Scanner(System.in);
		
		System.out.println("Enter the text");
	String s=sn.nextLine();
	System.out.println("Entered text is "+ s);
	sn.close();
	}

}
