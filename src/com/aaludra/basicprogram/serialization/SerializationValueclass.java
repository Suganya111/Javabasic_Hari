package com.aaludra.basicprogram.serialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializationValueclass implements Serializable {

	private static final long serialVersionUID = 1L;

	String name;
	int age;
	int salary;

	public List<Object> list() {

		List<Object> al = new ArrayList<>();
		al.add(23);
		al.add(75);
		al.add(23);
		al.add(45);
		return al;

	}

	public SerializationValueclass() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
