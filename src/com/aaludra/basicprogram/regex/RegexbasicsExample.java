package com.aaludra.basicprogram.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexbasicsExample {

	public static void main(String[] args) {

		String st = "harivishnu@gmail.com";
		Pattern p = Pattern.compile("[A-Z][a-z]");

		Matcher m = p.matcher(st);
		while (m.find()) {
			System.out.print(m.group());
		}
		System.out.println("\nnumeric values");
		Pattern.compile("\\w a");
		p.matcher(st);
		Pattern p1 = Pattern.compile("\\d");// it will give numeric values only

		Matcher m1 = p1.matcher(st);
		while (m1.find()) {
			System.out.print(m1.group());
		}
		System.out.println("\nQuantifiers");
		Pattern p2 = Pattern.compile("S+");// there are more quantifiers *,?,{}

		Matcher m2 = p2.matcher(st);
		while (m2.find()) {
			System.out.print(m2.group() + " ");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your email");
		String mob = sc.nextLine();
		Pattern p3 = Pattern.compile("^[a-zA-Z0-9 .-_[^%#*!$@]]+@[a-z.[a-z.]*]{8,15}+$");
		Matcher m3 = p3.matcher(mob);
		sc.close();

		if (m3.find()) {
			System.out.println(m3.group() + " - is valid mail id");

		} else {
			System.err.println(mob + " - is invalid mail id");
		}

	}

}
