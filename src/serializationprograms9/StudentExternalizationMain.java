package serializationprograms9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentExternalizationMain {

	public static void main(String[] args) throws Exception {
		try {
			File f = new File("Test.txt");
			StudentExternalizationDemo file = new StudentExternalizationDemo();

			ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(f));
			out1.writeObject(file);

			ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
			file = (StudentExternalizationDemo) in.readObject();

			System.out.println("After De externalization... \nStudentname: " + file.name + "  \nAge is:" + file.age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}