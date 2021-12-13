package com.aaludra.basicprogram;

/* give proper class name
 * 
 */
public class AccessModifiersExample {
	public String studentname = "Abc"; /*
										 * the public access modifier give access within and out side of the Class, and
										 * within and outside of the package
										 */

	private int studentage = 20; /*
									 * it can be access only within the class and can't be access out side of the
									 * class
									 */
	protected int studentid = 103; /*
									 * It can be access within the package only but it can be access it's inherited
									 * class
									 */

	public void newMethod() {
		System.out.println("Student name : " + studentname);
		System.out.println("Student age : " + studentage);
		System.out.println("Student id : " + studentid);
	}

	public static void main(String[] args) {
		AccessModifiersExample obj = new AccessModifiersExample();
		obj.newMethod();

	}

}
