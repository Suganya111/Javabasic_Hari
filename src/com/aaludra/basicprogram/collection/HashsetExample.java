package com.aaludra.basicprogram.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>();
		hs.add(11);
		hs.add(34);
		hs.add(32);
		hs.add(37);
		hs.add(25);
		hs.add(90);
		hs.add(90);// duplication is not allowed in hashset

		System.out.println(hs);
		System.out.println("\nList contains 90 ? :  " + hs.contains(90));// if the set contains 90 it will give true

		System.out.println(hs.isEmpty());// if the set is empty it will give true
		System.out.println("\nPrinting values using itrators \n");
		Iterator<Object> i = hs.iterator();
		while (i.hasNext())
			System.out.println(i.next());// it is unordered hashset
		hs.clear();
		System.out.println("\nAfter cleared the set  : " + hs.isEmpty());

	}

}
