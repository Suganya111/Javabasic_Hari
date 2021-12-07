package com.aaludra.basicprogram;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
	
		
		for(int i=0; i< text.length() ;i++) {
			System.out.println(text.charAt(i));
			sc.close();			
			
		}
	}

}
