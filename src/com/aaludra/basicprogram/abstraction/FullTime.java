package com.aaludra.basicprogram.abstraction;

class FullTime extends Employee {
	void computeSalary() {
		salary = 4 * 3000;
	}

	public static void main(String[] args) {

		Employee obj = new FullTime();
		obj.setName("Zyx A");// use proper input
		String eName1 = obj.getName();
		obj.computeSalary();
		int esalary = obj.getSalary();
		System.out.println("Name of the full time employe : " + eName1 + "\nEmpSalary : " + esalary);

	}

}
