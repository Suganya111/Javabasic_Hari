package com.aaludra.basicprogram.javaloops;
/* to System.out.print to "enter the text" statement to get input from the user
 * 
 */
import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		System.out.println("Enter the next:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
	
		
		for(int i=0; i< text.length() ;i++) {
			System.out.println(text.charAt(i));
			sc.close();			
			
		}
	}

}
