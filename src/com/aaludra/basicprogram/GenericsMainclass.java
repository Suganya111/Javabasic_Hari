package com.aaludra.basicprogram;

import java.util.ArrayList;

public class GenericsMainclass {
	public void display(ArrayList<?> al) {// It will accept all data types.

		System.out.println(al);

	}

	public static void main(String[] args) {
		GenericsMainclass obj = new GenericsMainclass();
		ArrayList<Object> iarr = new ArrayList<>();
		iarr.add(34);
		iarr.add(92);
		iarr.add("Number");
		obj.display(iarr);

		ArrayList<String> sarr = new ArrayList<>();
		sarr.add("Hari");
		sarr.add("Vishnu");
		obj.display(sarr);

	}

}
