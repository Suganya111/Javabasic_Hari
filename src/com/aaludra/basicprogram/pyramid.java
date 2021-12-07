package com.aaludra.basicprogram;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value to be printed");
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
		for(int j=0;j<i;j++)
		{
		System.out.print(" " + i);


		}
		System.out.println(" ");
		sc.close();
		}
		System.out.println("");
		System.out.println("End of triangle ");

	}

}
