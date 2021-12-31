package com.aaludra.basicprogram.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorNew {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(23);
		number.add(10);
		number.add(05);
		number.add(76);
		number.add(3);
		number.add(67);
		Iterator<Integer> it = number.iterator();
		while (it.hasNext()) {
			int i = it.next();

			if (i > 10) {
				it.remove();
			}

		}
		System.out.println(number);
	}

}
