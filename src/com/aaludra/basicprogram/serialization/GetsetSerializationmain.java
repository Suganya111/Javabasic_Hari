package com.aaludra.basicprogram.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class GetsetSerializationmain {
	public static void serialize() throws Exception {

		SerializationValueclass obj = new SerializationValueclass();

		obj.setName("Jovia");
		obj.setSalary(40000);
		obj.setAge(20);

		try {
			List<Object> arr = obj.list();

			FileOutputStream out = new FileOutputStream("Pojo.txt");
			ObjectOutputStream os = new ObjectOutputStream(out);
			os.writeObject(obj);
			os.writeObject(arr);
			os.flush();
			os.close();
			out.close();
			System.out.println("Objects are serialized");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void deserialize() throws Exception {
		try {
			SerializationValueclass obj1 = new SerializationValueclass();

			List<Object> arr = obj1.list();

			FileInputStream fi = new FileInputStream("Pojo.txt");
			ObjectInputStream is = new ObjectInputStream(fi);
			obj1 = (SerializationValueclass) is.readObject();
			System.out.println("\n" + "Name: " + obj1.name + "  Age: " + obj1.age + " Salary: " + obj1.salary);
			System.out.println("\nArraylist " + arr);
			fi.close();
			is.close();

			{
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
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
