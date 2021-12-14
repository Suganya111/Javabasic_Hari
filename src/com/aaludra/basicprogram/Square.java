package com.aaludra.basicprogram;

public class Square extends Shape {

	@Override
	public double getArea(double d) {
		double area = d * d;
		return area;
	}

	@Override
	public double getPerimeter(double d) {
		double perimeter = 4 * d;
		return perimeter;
	}

	public static void main(String[] args) {

		Shape obj2 = new Square();
		System.out.println(
				" Area of square is " + obj2.getArea(4) + "\n Perrimeter of square is " + obj2.getPerimeter(9.1));

	}

}
