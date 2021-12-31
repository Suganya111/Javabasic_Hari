package com.aaludra.basicprogram.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializationExample implements Serializable {

	String name;
	int age;
	transient int salary; // it will not serialize the value

	public static void main(String[] args) {

		SerializationExample obj = new SerializationExample();
		obj.name = "Hari";
		obj.age = 22;

		obj.salary = 40000;

		try {
			FileOutputStream file = new FileOutputStream(new File("Emp.txt"));
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(obj);
			file.close();
			out.close();
			System.out.println("Serialized datas are saved in 'Emp.txt file' " + obj);

		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}