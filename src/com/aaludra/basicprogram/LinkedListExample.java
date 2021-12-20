package com.aaludra.basicprogram;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Character> al = new LinkedList<>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		al.add('f');

		System.out.println(al);

		al.poll();// will remove the first element of the list
		System.out.println(al);
		System.out.println(al.offerFirst('z') + "\n" + al);// it will add the given element at the first oposition of
		// the index

		System.out.println(al);
	}

}
