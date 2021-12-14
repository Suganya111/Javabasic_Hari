package com.aaludra.basicprogram;

public class Circle extends Shape {

	@Override
	public double getArea(double d) {
		double area = Math.PI * (d * d);
		return area;
	}

	@Override
	public double getPerimeter(double d) {
		double perimeter = 2 * Math.PI * d;
		return perimeter;
	}

	public static void main(String[] args) {
		Shape obj = new Circle();
		System.out.println("Area of circle is " + obj.getArea(3.1));
		System.out.println("Perimeter of circle is " + obj.getPerimeter(1.243));

	}
}
