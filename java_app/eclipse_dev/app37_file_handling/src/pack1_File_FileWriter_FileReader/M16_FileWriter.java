package pack1_File_FileWriter_FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class M16_FileWriter {
	public static void main(String[] args) throws IOException{
//		File f1 = new File("hello.txt");
		FileWriter out = new FileWriter("hello.txt", true);// opens the file for writing. If does not exist, it creates one.
		out.write("abc xyz test m16 \n");// \n - newline character, adds a newline.
		out.write("abc xyz test m16 \n");
		out.write("abc xyz test m16 \n");
		out.write("abc xyz test m16 \n");
		out.write("abc xyz test m16 \n");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
