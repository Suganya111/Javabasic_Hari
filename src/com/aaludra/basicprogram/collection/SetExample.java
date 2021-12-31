package com.aaludra.basicprogram.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>();
		set1.add(5);
		set1.add(32);
		set1.add(83);
		set1.add(032);
		set1.add(43);
		set1.add(6);
		System.out.println("Set1 implements treeset : " + set1);

		Set<Integer> set2 = new HashSet<>();
		set2.addAll(set1);
		set2.add(99);
		set2.add(74);
		set2.add(100);
		set2.add(42);
		set2.add(83);
		System.out.println("Set2 implements hashset : " + set2);
		System.out.println(set2.contains(83)); // tocheck if the given element is there or not
		System.out.println("Checks if the set contains all elements of set1 or not : " + set2.containsAll(set1));// checks
																													// if
																													// the
																													// element
																													// contains
																													// all
																													// elements
																													// of
																													// set1

		System.out.println("Checks if the set is empty or not : " + set2.isEmpty());// checks if the set2 is empty or
		set2.remove(32); // not
		System.out.println("Remove element 32 from set set2 : " + set2);// it will remove the given element
		System.out.println("Size of the set : " + set2.size());// will give the size of the set

		set2.retainAll(set1);// give similar elements
		System.out.println("Similar elements for both sets : " + set2);
		set2.removeAll(set1); // will remove all the set1 elements from set2

		System.out.println("Remaining element from set2 after removed all : " + set2);
	}

}
