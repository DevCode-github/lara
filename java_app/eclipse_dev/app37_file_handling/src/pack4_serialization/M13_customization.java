package pack4_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M13_customization {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileOutputStream fout = new FileOutputStream("I.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		I i = new I();
		out.writeObject(i);
		out.flush();
		out.close();
		fout.close();
		FileInputStream fin = new FileInputStream("I.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		I i1 = (I)in.readObject();
		System.out.println(i1.i + ", " + i.j +", " + i.k);
		in.close();
		fin.close();
		
	}
}
