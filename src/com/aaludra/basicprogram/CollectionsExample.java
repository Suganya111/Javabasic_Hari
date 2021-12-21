package com.aaludra.basicprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("Apple");
		ls.add("Graphs");
		ls.add("Pinapple");
		ls.add("Banana");

		System.out.println(ls);

		System.out.println(Collections.max(ls));
		System.out.println(Collections.min(ls));
		Collections.sort(ls);
		System.out.println(ls);
		Collections.sort(ls, Collections.reverseOrder());
		System.out.println(ls);

	}
}
