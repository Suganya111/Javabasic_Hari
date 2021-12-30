package com.aaludra.basicprogram;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Object> arri = new ArrayList<>();

		arri.add(1); // This method will append the element at the end of the list
		arri.add(2);
		arri.add(3);
		arri.add(4);
		arri.add(5);
		arri.add(0);
		arri.add(0, "Hari");
		arri.add(3, 4); // this function will add 4 at 3rd index
		System.out.println(arri); // it will give the arraylist element
		System.out.println(arri.indexOf(3)); // it will give the index of the particular element
		System.out.println(arri.contains(5) + "\n" + arri.contains(6)); // if the given element is in the list it will
																		// give true or return false
		System.out.println(arri.get(4));// it will the element at this position

		System.out.println(arri.remove(7) + " \n" + arri);// it will remove the element at the given position

		ArrayList<Object> arri2 = new ArrayList<>();
		arri2.add("Arri2 arraylist");
		arri2.addAll(arri);// it will add the arri list to arri2
		arri2.add("New arraylist");
		System.out.println("New array list createrd using old one " + arri2);

		arri2.addAll(3, arri);// it will add the arri list to arri2 from the index of 3

		System.out.println(arri2);
		arri2.remove(3);
		System.out.println(arri2);
		arri2.removeAll(arri);
		System.out.println("After removing the all arri elements\n" + arri2);
	}

}
