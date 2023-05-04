/*
 * CE -> Class exercise
 */
package pack4_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class B implements Serializable{
	int i;
	String s;
	B(int i, String s){
		this.i = i;
		this.s = s;
	}
}
public class M3_CE_serialization {
	public static void main(String[] args) throws IOException{
		B b = new B(1,"Divyanshu kuamr");
		FileOutputStream fout = new FileOutputStream("b.ser");
		ObjectOutputStream bout = new ObjectOutputStream(fout);
		bout.writeObject(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("done");
	}
}
