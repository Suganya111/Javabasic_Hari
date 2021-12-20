package com.aaludra.basicprogram;

import java.util.Scanner;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumProgram {

	Day day;

	public EnumProgram(Day day) {
		this.day = day;
	}

	public void dayIsLike() {
		switch (day) {//use defualt case for Invalid  input
		
		case MONDAY:
			System.out.println("First day of the week");
			break;
		case TUESDAY:
			System.out.println("Second day of the week");
			break;
		case WEDNESDAY:
			System.out.println("Third day of the week");
			break;
		case THURSDAY:
			System.out.println("Fourth day of the week");
			break;
		case FRIDAY:
			System.out.println("Fifth day of the week");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Week end");
			break;

		}
	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the day in capital letters");
		str = sc.nextLine();

		EnumProgram t1 = new EnumProgram(Day.valueOf(str));
		t1.dayIsLike();
		System.out.println(t1.toString());
		sc.close();
	}
	

}
