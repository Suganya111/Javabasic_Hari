package com.aaludra.basicprogram;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String args[]) {

		StringTokenizer st = new StringTokenizer("this is-string-tokenizer-program", "-", true);
		System.out.println(st.countTokens() + "\n");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
		System.out.println("\n" + st.hashCode());
		System.out.println(st.toString());
	}
}