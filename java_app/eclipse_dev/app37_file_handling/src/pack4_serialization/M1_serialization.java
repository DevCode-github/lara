package pack4_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class A implements Serializable{
	int i;
}
public class M1_serialization {
	public static void main(String[] args) throws IOException{
		A a1 = new A();
		a1.i = 2;
		FileOutputStream fout = new FileOutputStream("a1.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.flush();
		out.close();
		fout.close();
		System.out.println("done");
	}
}
