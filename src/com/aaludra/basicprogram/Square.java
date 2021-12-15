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

}
