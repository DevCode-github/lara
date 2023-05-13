package pack4_serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M12_deserialzation_modification {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("test.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		H h1 = (H)in.readObject();
		System.out.println(h1.i);
		in.close();
		fin.close();
	}
}
