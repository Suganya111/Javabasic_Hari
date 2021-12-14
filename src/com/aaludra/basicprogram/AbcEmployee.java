package com.aaludra.basicprogram;

public class AbcEmployee implements EmployeeRules {
	static int z = 3;
	static float x;
	static float y = x * z;

	@Override
	public void maintainHours(String a, String b) {
		System.out.println(a + " Is Working hours for the employee " + b);

	}

	@Override
	public void bonus() {

	}

	public static void main(String[] args) {
		AbcEmployee abc = new AbcEmployee();

		abc.maintainHours("40hrs per week", " Hari");

	}

}
