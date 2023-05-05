package pack4_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
@SuppressWarnings("serial")
class C implements Serializable{
	int i;
}
@SuppressWarnings("serial")
class D extends C{
	int j;
}
@SuppressWarnings({"unchecked","rawtypes"})
public class M5_superclass {
	public static void main(String[] args) throws IOException{
		D d1 = new D();
		d1.i = 20;
		d1.j = 40;
		D d2 = new D();
		d2.i = 30;
		d2.j = 50;
		D d3 = new D();
		d3.i = 40;
		d3.j = 60;
		ArrayList list = new ArrayList();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		FileOutputStream fout = new FileOutputStream("d.ser",true);
		ObjectOutputStream bout = new ObjectOutputStream(fout);
		for (Object obj : list) {
			bout.writeObject(obj);
		}
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("done");
		
	}
}
