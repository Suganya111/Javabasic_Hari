package com.aaludra.basicprogram;


public class Encap {

	private long Empid;
	private String Name;
	private int salary;
	private String program;

	public Encap(String program) {
		this.program = program;
	}

	public String getEncap() {
		return program;
	}

	public long getEmpid() {
		return Empid;
	}

	public void setEmpid(long empid) {
		Empid = empid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Encap obj = new Encap("constructor getter");
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
