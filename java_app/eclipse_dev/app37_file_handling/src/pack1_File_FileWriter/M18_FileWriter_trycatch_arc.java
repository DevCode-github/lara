package pack1_File_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class M18_FileWriter_trycatch_arc {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
	
		try (FileWriter out = new FileWriter("hello.txt", true)){// Auto resource closing
			out.write("abc xyz test m17 \n");// \n - newline character, adds a newline.
			out.write("abc xyz test m17 \n");
			out.write("abc xyz test m17 \n");
			out.write("abc xyz test m17 \n");
			out.write("abc xyz test m17 \n");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
