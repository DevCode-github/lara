package pack4_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M10_static_transient {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		G g1 = null;
		try(FileInputStream fout = new FileInputStream("g.ser") ; ObjectInputStream in = new ObjectInputStream(fout) ) {
			g1 = (G) in.readObject();
		}
		catch(IOException | ClassNotFoundException ex) {
			System.out.println("error aborting");
		}
		System.out.println(g1.i+ ", "+ g1.j + ", " + g1.k);
		System.out.println("done");
	}
}
