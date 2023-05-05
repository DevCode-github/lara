package pack4_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M8_CE_superclass_deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("f.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		F f1 = (F)in.readObject();
		System.out.println(f1.j + ", " + f1.e1.i);
		in.close();
		fin.close();
	}
}