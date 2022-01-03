package com.aaludra.basicprogram.revision;

public class NestedSwitch6 {

	public static void main(String[] args) {
		int price = 1000;
		String shoes = "nike";

		switch (price) {
		case 500:
			switch (shoes) {
			case "nike":
				System.out.println("nike 11 model is 500rs");
				break;
			case "addidas":
				System.out.println("Addidas 22 model is 500rs");
				break;
			case "puma":
				System.out.println("Puma 33 model is 500rs");
				break;
			default:
				System.out.println("no such brand");
			}
			break;
		case 1000:
			switch (shoes) {
			case "nike":
				System.out.println("nike 11s model is 1000rs");
				break;
			case "addidas":
				System.out.println("Addidas 22s model is 1000rs");
				break;
			case "puma":
				System.out.println("Puma 33s model is 1000rs");
				break;
			default:
				System.out.println("no such brand");
			}
			break;
		default: {
			System.out.println("Invalid amount");
		}
		}
	}

}
