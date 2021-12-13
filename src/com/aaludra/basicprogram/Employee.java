package com.aaludra.basicprogram;

public abstract class Employee {
	private String name;
	int salary;

	public String getName() {
		return name;
	}

	public String setName(String x) {
		return this.name = x;
	}

	abstract void computeSalary();

	int getSalary() {
		return salary;
	}

}
