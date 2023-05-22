/*
 * used in M13_customization
 */
package pack4_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class I implements Serializable{
	int i,j,k;
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();
		out.writeInt(3000);
		out.writeUTF("xyz");
		System.out.println("from defaultWrite");
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		System.out.println("from defaultRead");
		in.defaultReadObject();
		System.out.println(in.readInt());
		System.out.println(in.readUTF());
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileOutputStream fout = new FileOutputStream("I.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		I i = new I();
		i.i = i.k = i.j = 500;
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
