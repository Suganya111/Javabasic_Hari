package com.aaludra.basicprogram.collection;

import java.util.HashMap;

public class HashmapExample {

	public static void main(String[] args) {

		HashMap<Integer, Object> hs = new HashMap<>();
		hs.put(22, "hari");
		hs.put(23, "Vishnu");
		hs.put(83, "babu");
		hs.put(93, "Suganya");
		hs.put(43, "Abc");

		System.out.println(hs.keySet()); // gives keyset only
		System.out.println(hs.values()); // gives value only
		System.out.println(hs);
		System.out.println(hs.clone());// it will give the cloned copy of the map
		System.out.println(hs.remove(23, "Suganya"));// if the given value and key are not matched or if not present
														// return false
		System.out.println(hs.replace(22, "Velu"));// It replaces the value of the given key with given value
		System.out.println(hs);
		System.out.println(hs.size());// return the size of the map in integer form

	}

}
