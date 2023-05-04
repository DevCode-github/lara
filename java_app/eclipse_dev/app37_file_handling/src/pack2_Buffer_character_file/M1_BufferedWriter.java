package pack2_Buffer_character_file;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class M1_BufferedWriter{
	public static void main(String[] args) throws IOException{
		File f1 = new File("test.txt");
		FileWriter fout = new FileWriter(f1);
		BufferedWriter bout = new BufferedWriter(fout);
		bout.write("abc xyz test m1");
		bout.write("abc xyz test m1");
		bout.newLine();
		bout.write("abc xyz test m1");
		bout.write("abc xyz test m1");
		bout.newLine();
		bout.write("abc xyz test m1");
		bout.write("abc xyz test m1");
		bout.flush();
		bout.close();
//		fout.flush();// Should not be after bout.close()
		fout.close();
		System.out.println("done");
	}
}
