package com.aaludra.basicprogram;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Hari");
		ts.add("Vishnu");
		ts.add("Bharathi");
		ts.add("Praveen");
		ts.add("Vicky");
		ts.add("Nandha");
		ts.add("Bharathi");// it is not taking duplication

		System.out.println(ts + "\n");

		System.out.println("\nDescending order");
		Iterator<String> itr2 = ts.descendingIterator();// this will give the descending order of the given element
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("\n" + ts.contains("Hari") + "\n" + ts.lower("Nandha"));// lower function will give the
		// previous value of the given value
		System.out.println("\n" + ts.pollFirst());// first value
		System.out.println(ts.pollLast());// last value
	}

}
