package pack1_File_FileWriter;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class M14_file_IOException_FileWriter {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) throws IOException{
		File f1 = new File("hello.txt");
		FileWriter out = new FileWriter(f1);// opens the file for writing. If does not exist, it creates one.
		out.write("abc xyz test \n");// \n - newline character, adds a newline.
		out.write("abc xyz test \n");
		out.write("abc xyz test \n");
		out.write("abc xyz test \n");
		out.write("abc xyz test \n");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
