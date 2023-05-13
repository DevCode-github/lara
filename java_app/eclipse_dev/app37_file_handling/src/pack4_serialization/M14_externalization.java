package pack4_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * Externalizable extending serializable
 */
public class M14_externalization {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileOutputStream fout = new FileOutputStream("J.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		J j1 = new J();
		j1.j = j1.i = 100;
		j1.k = "hello";
		j1.writeExternal(out);
		out.flush();
		out.close();
		fout.close();
		FileInputStream fin = new FileInputStream("J.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		J j2 = new J();
		j2.readExternal(in);
		in.close();
		fin.close();
		System.out.println(j2.i + ", " + j2.j + ", " + j2.k);
		
	}
}
