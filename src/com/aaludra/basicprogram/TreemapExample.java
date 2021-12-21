package com.aaludra.basicprogram;

import java.util.TreeMap;

public class TreemapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(10, "a");
		tm.put(35, "b");
		tm.put(003, "c");
		tm.put(16, "d");
		tm.put(15, "e");
		System.out.println(tm);
		System.out.println("This is the first entry of the treemap : " + tm.firstEntry());
		System.out.println("This is the first key of the treemap : " + tm.firstKey());
		System.out.println("This is the first entry and it will be deleted : " + tm.pollFirstEntry());
		System.out.println("Tree map after deleting the first entry : " + tm);
		System.out.println("15=e entry deleted : " + tm.remove(35));
		System.out.println(tm);

		System.out.println(tm.containsKey(16));// if the key is present in the treemap it will give true
		tm.replace(10, "Alphabet");// it will replace the value of the given key with given value
		System.out.println(tm);

	}

}
