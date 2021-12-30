package com.aaludra.basicprogram;

public class InterfaceAbcEmployee implements InterfaceEmployeeRules {
	static int z = 3;// unused data types
	static float x;
	static float y = x * z;

	@Override
	public void maintainHours(String a, String b) {
		System.out.println(" Total work time is " + a + " for employe: " + b);
	}

	@Override
	public double bonus(int a) {
		double d = z * a;
		return d;

	}

	public static void main(String[] args) {
		InterfaceAbcEmployee abc = new InterfaceAbcEmployee();

		abc.maintainHours("40hrs per week", " Vishnu");

		System.out.println("Bonus for the employee is " + abc.bonus(50000));

	}

}
