package pack2_Buffer_character_file;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class M2_BufferedWriter {
	public static void main(String[] args) throws IOException{
		File f1 = new File("self.txt");
		FileWriter fout = null;
		BufferedWriter bout = null;
		try {
			fout = new FileWriter(f1);
			bout = new BufferedWriter(fout);
			bout.write("divyashu kumar m2");
			bout.write("divyashu kumar m2");
			bout.newLine();
			bout.write("divyashu kumar m2");
			bout.write("divyashu kumar m2");
			bout.newLine();
			bout.write("divyashu kumar m2");
			bout.flush();
			bout.close();
			fout.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
				try {
					if(bout != null) {
						bout.flush();
						bout.close();
					}
					if(fout != null) fout.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
		}				
		System.out.println("done");
	}
}
