package com.aaludra.basicprogram.revision;

public class StaticVariable1 {

	public String name;
	int marks;
	static int age = 22;

	public StaticVariable1(String stuname) {
		name = stuname;
	}

	public void setStumark(int stumark) {
		marks = stumark;
	}

	public void display() {

		System.out.println("\nName of the student is : " + name + "\nmark of the student " + marks
				+ "\nAge of the studet: " + age + "\n________________");
	}

	public static void main(String[] args) {

		StaticVariable1 std1 = new StaticVariable1("Hari");
		StaticVariable1 std2 = new StaticVariable1("Vishnu");

		std1.setStumark(80);
		std2.setStumark(43);

		std1.display();
		std2.display();

	}

}
