package com.aaludra.basicprogram;

import java.util.LinkedHashSet;

class Worker {

	int empid;
	String empname;
	String mailid;
	int salary;

	public Worker(int empid, String empname, String mailid, int salary) {
		this.empid = empid;
		this.empname = empname;
		this.mailid = mailid;
		this.salary = salary;
	}
}

public class LinkedHashsetexample {
	public static void main(String[] args) {

		LinkedHashSet<Worker> hs = new LinkedHashSet<>();
		Worker e1 = new Worker(102, "Hari", "Hari@.com", 40000);
		Worker e2 = new Worker(103, "Surya", "Surya@.com", 40000);
		Worker e3 = new Worker(104, "Vijay", "Vijay@.com", 35000);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);// it is an ordered hashset

		for (Worker s : hs) {
			System.out.println(s.empid + " " + s.empname + " " + s.mailid + " " + s.salary);
		}

	}

}
