package pack4_serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M6_superclass_deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("d.ser");
		ObjectInputStream bin = new ObjectInputStream(fin);
		D d1 = (D) bin.readObject();
		while (true) {
			System.out.println(d1.i + ", " + d1.j);
			try {
				d1 = (D) bin.readObject();
			}
			catch(EOFException ex) {
				System.out.println("reached the end, Aborting...");
				break;
			}
		}
		bin.close();
		fin.close();
		System.out.println("done");
		
	}
}
