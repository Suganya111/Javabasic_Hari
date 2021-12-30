package com.aaludra.basicprogram;

import java.io.Serializable;
import java.util.LinkedList;

public class SerializationPojoclass implements Serializable {

	private static final long serialVersionUID = 1L;

	String name;
	int age;
	int salary;

	public void list() {
		LinkedList<Object> al = new LinkedList<>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		al.add('f');
	}

	public SerializationPojoclass() {

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
