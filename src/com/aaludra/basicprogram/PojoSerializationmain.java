package com.aaludra.basicprogram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PojoSerializationmain {
	public static void serialize() throws Exception {

		SerializationPojoclass obj = new SerializationPojoclass();

		obj.setName("Jovia");
		obj.setSalary(40000);
		obj.setAge(20);
		obj.list();

		FileOutputStream out = new FileOutputStream("Pojo.txt");
		ObjectOutputStream os = new ObjectOutputStream(out);
		os.writeObject(obj);
		out.close();
		os.close();
		System.out.println("Objects are serialized");

	}

	public static void deserialize() throws Exception {

		FileInputStream in = new FileInputStream("Pojo.txt");
		ObjectInputStream is = new ObjectInputStream(in);
		SerializationPojoclass obj = (SerializationPojoclass) is.readObject();

		System.out.println("Deserialized object :" + obj.name + " " + obj.salary + " " + obj.age);

		in.close();
		is.close();

	}

	public static void main(String[] args) {

		try {
			serialize();
			deserialize();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
