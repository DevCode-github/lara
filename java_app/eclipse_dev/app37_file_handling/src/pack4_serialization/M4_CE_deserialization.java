/*
 * CE -> Class exercise
 */

package pack4_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M4_CE_deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fin = new FileInputStream("b.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		B b = (B)in.readObject();
		in.close();
		fin.close();
		System.out.println(b.i + ", " + b.s);
	}
}
