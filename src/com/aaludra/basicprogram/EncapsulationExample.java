package com.aaludra.basicprogram;
/* create another class for program with 
 * main function and set the values in  class and 
 * create object for the main class *
 * specify valid class name 
 * variable name is start with smaller case
 * */

public class EncapsulationExample {

	private long empid;
	private String name;
	private int salary;
	private String program;

	public EncapsulationExample(String program) {
		this.program = program;
	}

	public String getEncap() {
		return program;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long Empid) {
		empid = Empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		name = Name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		EncapsulationExample obj = new EncapsulationExample("constructor getter");
		obj.setEmpid(123456l);
		System.out.println("Enter employe id : " + obj.getEmpid());
		obj.setName("Hari");
		obj.setSalary(35000);
		System.out.println("Name of the employe : " + obj.getName());
		System.out.println(obj.getName() + "'s salary is : " + obj.getSalary());
		System.out.println(" ");

		System.out.println(obj.getEncap());

	}

}
