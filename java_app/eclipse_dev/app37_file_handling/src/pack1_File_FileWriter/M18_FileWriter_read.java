package pack1_File_FileWriter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M18_FileWriter_read {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) throws IOException{
		File f1 = new File("hello.txt");
		char[] chars = new char[(int) f1.length()];//length() return long data type, narrow it to int
		try (FileReader in = new FileReader(f1)) {
			in.read(chars);
		}
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
