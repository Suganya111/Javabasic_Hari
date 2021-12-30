package serializationprograms9;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class StudentExternalizationDemo implements Externalizable {
	public String name = "Hari";
	public int age = 22;
	public int mark = 500;
	public char grade = 'A';

	public StudentExternalizationDemo() {
	}

	public StudentExternalizationDemo(String name, int age, char grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
	}
}
