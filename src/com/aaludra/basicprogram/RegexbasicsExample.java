package com.aaludra.basicprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexbasicsExample {

	public static void main(String[] args) {
		String st = "The Java Regex or Regular Expression is an API" + " to define a pattern for searching or "
				+ "manipulating strings";
		Pattern p = Pattern.compile("[^f-xA-R]");

		Matcher m = p.matcher(st);
		while (m.find()) {
			System.out.print(m.group());
		}
	}

}
