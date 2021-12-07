package com.aaludra.basicprogram;

public class MethodDeclaration {
	public static void myMethod(int x) {
		if(x%3==0)
		{
			System.out.println(x+ " is multiples of 3");
		} 
		else if(x%2==0)
		{
			System.out.println(x+" is multiples of 2");
			}
		
		else
		{
			System.out.println(x + " is not multipls of 3 or 2");
			
		}
	}

	public static void main(String[] args) {
		myMethod(12);
		
			
		}

	

}
