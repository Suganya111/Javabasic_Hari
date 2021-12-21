package com.aaludra.basicprogram;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> tm = new LinkedHashMap<>();
		tm.put(10, "a");
		tm.put(35, "b");
		tm.put(003, "c");
		tm.put(16, "d");
		tm.put(15, "e");
		System.out.println(tm);
		System.out.println("This value of key 10 is : " + tm.get(10));
		System.out.println(tm.entrySet());

	}

}
