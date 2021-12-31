package com.aaludra.basicprogram.stringhandling;

public class StringBufferexample {

	public static void main(String[] args) {
		StringBuffer st = new StringBuffer(" This ");
		st.append("is ");
		System.out.println(st);
		st.insert(8, " new project for string buffer");
		System.out.println("'new' word added in this string :" + st);
		st.replace(0, 05, "That");
		System.out.println("This is replaced new string :  " + st);
		st.reverse();
		System.out.println(st);
		st.reverse();

		System.out.println("This method will show the current capacity of the string : " + st.capacity());
		System.out.println("This string delete method : " + st.delete(11, 19));
		System.out.println("This is string length function : " + st.length());
		System.out.println("This is substring function : " + st.substring(10, 20));
	}

}
