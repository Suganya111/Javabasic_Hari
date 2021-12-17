package com.aaludra.basicprogram;

import com.aaludra.basicprogram.EnumerationTask.CurrencyEnum;

public class EnumerationMain {

	public static void main(String[] args) {

		CurrencyEnum s = CurrencyEnum.getSymbol("India");
		System.out.println(s.symbol);

		CurrencyEnum s1 = CurrencyEnum.getCurrency("USA");
		System.out.println(s1.compareTo(s1));
		System.out.println(s1.equals(s1));
		System.out.println(s1.hashCode());
		System.out.println(s1.name());
		System.out.println(s1.ordinal());

	}
}
