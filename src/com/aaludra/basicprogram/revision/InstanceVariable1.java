package com.aaludra.basicprogram.revision;

public class InstanceVariable1 {
	public String name;
	private int marks;

	public InstanceVariable1(String stuname) {
		name = stuname;
	}

	public void setStumark(int stumark) {
		marks = stumark;
	}

	public void display() {
		System.out
				.println("\nNameof the student is : " + name + "\nmark of the student " + marks + "\n________________");
	}

	public static void main(String[] args) {

		InstanceVariable1 std1 = new InstanceVariable1("Hari");
		InstanceVariable1 std2 = new InstanceVariable1("Vishu");
		InstanceVariable1 std3 = new InstanceVariable1("Shiva");

		std1.setStumark(80);
		std2.setStumark(90);
		std3.setStumark(92);

		std1.display();
		std2.display();
		std3.display();
	}

}
