package pack2_Buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M3_BufferedWriter_arc {
	public static void main(String[] args) {
		File f1 = new File("self.txt");
		try (FileWriter fout = new FileWriter(f1) ; BufferedWriter bout = new BufferedWriter(fout)){
			bout.write("divyashu kumar m3");
			bout.write("divyashu kumar m3");
			bout.newLine();
			bout.write("divyashu kumar m3");
			bout.write("divyashu kumar m3");
			bout.newLine();
			bout.write("divyashu kumar m3");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
