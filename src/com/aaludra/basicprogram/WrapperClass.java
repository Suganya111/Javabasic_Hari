package com.aaludra.basicprogram;

public class WrapperClass {

	public static void main(String[] args) {
		// Auto boxing
		String a = "Auto boxing method";
		String a2 = a;

		int i = 10;
		Integer i2 = i;

		float f = 90.4f;
		Float f2 = f;

		short s = 34;
		Short s2 = s;
		System.out.println(" Auto boxing " + "\n string to String: " + a2 + "\n int to Integer : " + i2
				+ "\nfloat to Float : " + f2 + "\nshort to Short : " + s2 + "\n");
//unboxing
		String srt = a2;
		int i3 = i2;
		float f3 = f2;
		short s3 = s2;
		System.out
				.println("Un-boxing " + "\nString :" + srt + "\nint : " + i3 + "\nfloat : " + f3 + " \nshort : " + s3);

		// Xxxvalue();method
		System.out.println("\n Byte value of integer i2 is : " + (i2.byteValue()));
		System.out.println(" Short value of integer i2 is : " + (i2.shortValue()));
		System.out.println(" float value of integer i2 is : " + (i2.floatValue()));
		int e = Integer.parseInt("1010", 2);
		System.out.println("\nParseInt : " + e);

		// tostring();
		String s4 = i2.toString();
		System.out.println("\ntoString method " + s4);

	}

}
