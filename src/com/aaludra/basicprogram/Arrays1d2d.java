package com.aaludra.basicprogram;

import java.util.Scanner;

public class Arrays1d2d {
	public static void oneD()
	{
		int in;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		in=sc.nextInt();
		int ary[]= new int [in];
		System.out.println("Enter "+ in + " elements to store in array");
		for(int i =0; i<in;i++) {
			ary[i]=sc.nextInt();
		}
		System.out.println("Elements stored in a array");
		for(int i=0;i<in;i++) {
			System.out.print(ary[i] + " "+ "");
			sc.close();
			
		} 
	}
	public static void twoD()
	{
	int [][] md= {{1,2},{3,4}};
	for (int i=0;i<2;i++) {
		for (int j=0;j<2;j++) {
			System.out.print(md[i][j]+" ");
		}
			System.out.println( );
			
		}}
		
	public static void main(String[] args) {
	twoD();
	oneD();
	
	
	}
	
	}


