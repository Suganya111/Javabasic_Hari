package com.aaludra.basicprogram;
/* its better to specify a valid class name
 * and System.out.println(" ") also used \n in the statement at the end 
 * variable name is not proper
 */
public class StringExample {

	public static void main(String[] args) {
		String main ="THIS IS THE SAMPLE STRING";
		String s1= "string";
		String s2= "STRING";
		String s3= "string operations";
		System.out.println("Alphabet at 4th position of the word string  =\n" + s1.charAt(3));
		System.out.println("After concadination   \n"+ main.concat(" OPERATION"));
		System.out.println("Ignorecase string operation  \n" + s2.equalsIgnoreCase("STRING") );
		System.out.println("Length of 'string operation' is  =\n" + s3.length());
		System.out.println("In main string replacing string with java \n" + main.replace("SAMPLE","JAVA"));
		System.out.println("The substring 5 is \n" + main.substring(4));
		System.out.println("The characters between 3 to 8  \n" + main.substring(2,9));
		System.out.println("Converting lowercase to uppercase 'string' \n " + s1.toUpperCase());
		System.out.println("Converting uppercase to lowercase 'STRING' \n" + s2.toLowerCase());
		System.out.println("Adding strings without whitespase using trim() \n" + s2.trim()+ "operation");
		System.out.println("search for string THE \n" + main.contains("THE"));

	}

}
