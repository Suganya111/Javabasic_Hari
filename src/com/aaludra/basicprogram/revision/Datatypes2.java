package com.aaludra.basicprogram.revision;

public class Datatypes2 {
	public void byteVl() {
		byte b = 10;
		byte b1 = 10;
		byte b3 = (byte) (b + b1);
		System.out.println("Byte valuue : " + b3);

	}

	public void shortVl() {

		short sh = 767;
		short sh1 = 300;
		short sh2 = (short) (sh + sh1);
		System.out.println("Short value : " + sh2);

	}

	public void integerVl() {
		int i = 234234;
		int i1 = 21474;
		int i2 = i + i1;
		System.out.println("Integer value is : " + i2);

	}

	public void longvl() {

		long l = 9223372036854l;
		long l1 = 245343453l;
		long l2 = l + l1;
		System.out.println("Long value is : " + l2);
	}

	public void floaatVl() {

		float f = 3257.1234567890f;
		float f1 = 42545.13412f;
		float f2 = f + f1;
		System.out.println("Float value is : " + f2);
	}

	public void doubleVl() {

		double d = 23423.2432245454;
		double d1 = 2342.21141;
		double d2 = d + d1;
		System.out.println("Double value is : " + d2);
	}

	public void charVl() {
		char ch = 'h';
		char ch1 = 's';
		System.out.println("Characters are : " + ch + ch1);
	}

	public void booleanVl() {
		short sh = 277;
		short sh2 = 34;
		short sh3 = (short) (sh + sh2);
		System.out.println("Short value is : " + sh3);

	}

	public static void main(String[] args) {
		Datatypes2 obj = new Datatypes2();
		obj.booleanVl();
		obj.byteVl();
		obj.charVl();
		obj.doubleVl();
		obj.floaatVl();
		obj.integerVl();
		obj.longvl();
		obj.shortVl();

	}

}
