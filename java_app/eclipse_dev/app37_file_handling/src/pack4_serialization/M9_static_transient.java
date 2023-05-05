package pack4_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class G implements Serializable{
	int i = 10;
	/*
	 * transient and static not involving in the serialization.
	 * Transient cannot survive serialization.
	 */
	transient int j;
	static int k =10;
}
public class M9_static_transient {
	 @SuppressWarnings("static-access")
	public static void main(String[] args) {
		G g1 = new G();
		g1.i = 20;
		g1.j = 50;
		g1.k = 70;
		try(FileOutputStream fout = new FileOutputStream("g.ser") ; ObjectOutputStream out = new ObjectOutputStream(fout) ) {
			out.writeObject(g1);
		}
		catch(IOException ex) {
			System.out.println("error, aborting");
		}
	}
}
