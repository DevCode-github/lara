package pack4_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class E implements Serializable{
	int i;
}
@SuppressWarnings("serial")
class F implements Serializable{//or extends to E while E implements serializable.
	int j;
	E e1;
}
public class M7_CE_superclass_serialization {
	public static void main(String[] args) throws IOException{
		E obj = new E();
		obj.i = 10;
		
		F f1 = new F();
		f1.j = 20;
		f1.e1 = obj;
		
		FileOutputStream fout = new FileOutputStream("F.ser");
		ObjectOutputStream bout = new ObjectOutputStream(fout);
		bout.writeObject(f1);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("done");
	}
}
