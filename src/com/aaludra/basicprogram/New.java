package com.aaludra.basicprogram;

public class New {

	public static void main(String[] args) {

		String[] myarr = { "a", "y", "n", "a", "r", "a", "s" };
		int i = myarr.length - 1;
		while (i >= 0) {
			if (myarr[i] == "s" || myarr[i] == "a" || myarr[i] == "y") {

				System.out.print(myarr[i].toUpperCase());
			} else {
				System.out.print(myarr[i]);

			}
			i--;
		}

	}

}
