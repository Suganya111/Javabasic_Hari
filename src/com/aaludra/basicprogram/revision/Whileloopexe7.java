package com.aaludra.basicprogram.revision;

import java.util.Scanner;

public class Whileloopexe7 {
	Scanner sc = new Scanner(System.in);

	public void table() {
		System.out.println("Enter the multiplication table");
		int n = sc.nextInt();
		System.out.println("Enter the number of multiplication");
		int m = sc.nextInt();
		int i = 1;
		while (i <= m) {

			System.out.printf("%d*%d=%d\n", i, n, i * n);

			i++;
		}
		sc.close();

	}

	public static void main(String[] args) {

		Whileloopexe7 obj = new Whileloopexe7();
		obj.table();

	}

}
