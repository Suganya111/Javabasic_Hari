package com.aaludra.basicprogram;

public class EnumerationTask {

	enum CurrencyEnum {
		INR("India", "@"), USD("USA", "$"), EUR("Europe", "#");

		CurrencyEnum(String country, String symbol) {

			this.country = country;
			this.symbol = symbol;
		}

		String country, symbol;

		public static CurrencyEnum getSymbol(String name) {
			for (CurrencyEnum value : CurrencyEnum.values()) {
				if (value.country.equals(name)) {

					return value;
				}
			}
			return null;
		}

		public static CurrencyEnum getCurrency(String country) {
			for (CurrencyEnum v : CurrencyEnum.values()) {
				if (v.country.equals(country)) {

					return v;
				}
			}
			return null;
		}

	}
}
