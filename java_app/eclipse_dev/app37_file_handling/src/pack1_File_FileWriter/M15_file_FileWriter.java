package pack1_File_FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M15_file_FileWriter {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) throws IOException{
		File f1 = new File("hello.txt");
		FileWriter out = new FileWriter(f1, true);// opens the file for writing. If does not exist, it creates one.
		out.write("abc xyz test m15 \n");// \n - newline character, adds a newline.
		out.write("abc xyz test m15 \n");
		out.write("abc xyz test m15 \n");
		out.write("abc xyz test m15 \n");
		out.write("abc xyz test m15 \n");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
