package pack4_serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class M11_Serialzation_modification {
	public static void main(String[] args) throws Exception{
		File f1 = new File("test.ser");
		FileOutputStream fout = new FileOutputStream(f1);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		H h1 = new H();
		h1.i = 200;
		out.writeObject(h1);
		out.flush();
		out.close();
		fout.close();
		System.out.println("done");
	}
}
