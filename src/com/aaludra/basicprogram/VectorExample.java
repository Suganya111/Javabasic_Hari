package com.aaludra.basicprogram;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Character> v = new Vector<>();
		v.addElement('a');
		v.addElement('e');
		v.addElement('i');
		v.addElement('o');
		v.addElement('u');

		System.out.println("Size is : " + v.size() + "  \nCapacity is : " + v.capacity());// it will show size of the
																							// vector
		v.add(3, 'c');
		System.out.println("Element 'c' is added : " + v);

		System.out.println("Index of 'o' is : " + v.indexOf('o'));
		v.removeElement('c');// As the same we can delete the element with it's index in the argument
		System.out.println("Element 'c' is removed : " + v);

	}
}
