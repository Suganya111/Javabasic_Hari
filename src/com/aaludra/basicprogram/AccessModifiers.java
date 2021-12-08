package com.aaludra.basicprogram;

public class AccessModifiers {
	public String studentname = "Abc"; /*the publice access modifier give access
	                                     within and out side of the
	                                    calss, and within and
	                                      outside of the package*/
	                                        
	private  int studentage= 20;     /*it can be access only within the class and can't be access
	                                  out side of the class*/
	protected int studentid=103;    /*It can be access within the package only
	                                 but it can be access it's inherited class */ 
	
	


	public void newMethod() {
		System.out.println("Student name : " + studentname);
		System.out.println("Student age : " + studentage);
		System.out.println("Student id : " + studentid);
	}

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.newMethod();
		

	}

}
