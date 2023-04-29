package pack1_File_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class M17_FileWriter_trycatch {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		FileWriter out = null;
		try {
			out = new FileWriter("hello.txt", true);// opens the file for writing. If does not exist, it creates one.
			out.write("abc xyz test m17 \n");// \n - newline character, adds a newline.
			out.write("abc xyz test m17 \n");
			out.write("abc xyz test m17 \n");
			out.write("abc xyz test m17 \n");
			out.write("abc xyz test m17 \n");
			out.flush();
			out.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(out != null) {// If out is not null close it, since it creates a physical connection and takes up system resources.
				try {
					out.flush();
					out.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		System.out.println("done");
	}
}
