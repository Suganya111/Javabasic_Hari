package com.aaludra.basicprogram;

public class JavaVariables {
	 
public static int staticVariable= 10;
int instanceVariable = 20;


 public void printValue() {
	 int localVariable = 30;
	 System.out.println("The Static variable is  -"  + staticVariable);
	 System.out.println("The instant variable is - "  + instanceVariable);
	 System.out.println("The local variable is  -"  + localVariable);
 }
    
	public static void main(String[] args) {
		
		JavaVariables variables = new JavaVariables(); 
		variables.printValue();
		
	
		
	}		


}
