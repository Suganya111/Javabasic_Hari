package com.aaludra.basicprogram.inheritance;

public class ShapesExtended {

	public static void main(String[] args) {
		Shape obj = new Square();
		System.out.println("Area of Square is " + obj.getArea(3.1));
		System.out.println("Perimeter of Square is " + obj.getPerimeter(1.243) + "\n");

		Shape obj2 = new Circle();
		System.out.println(" Area of Circle is " + obj2.getPerimeter(4.0) + "\n Perrimeter of Circle is "
				+ obj2.getPerimeter(9.1));

	}
}
