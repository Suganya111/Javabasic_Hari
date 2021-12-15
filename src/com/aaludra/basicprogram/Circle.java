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

}