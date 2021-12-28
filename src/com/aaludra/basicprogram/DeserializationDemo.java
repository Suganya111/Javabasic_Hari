package com.aaludra.basicprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		SerializationExample s = new SerializationExample();

		try {

			FileInputStream file2 = new FileInputStream("Emp.txt");
			ObjectInputStream in;
			in = new ObjectInputStream(file2);
			s = (SerializationExample) in.readObject();
			file2.close();
			in.close();

		} catch (FileNotFoundException f) {
			System.out.println(f);

		} catch (IOException e) {

			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Deserialize employee detail....");
		System.out.println("Emp namee - " + s.name);
		System.out.println("Emp age - " + s.age);
		System.out.println("Emp salary - " + s.salary);
	}
}