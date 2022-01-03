package com.aaludra.basicprogram.revision;

import java.util.Scanner;

//reverse table using do while loop
public class DoWhileexe7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the table");
		int i = sc.nextInt();
		int n = 5;
		do {
			int t = n * i;
			System.out.println(n + "X" + i + "=" + t);
			i--;
		} while (i > 0);
		sc.close();
	}

}
