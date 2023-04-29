package pack1_File_FileWriter_FileReader;

import java.io.File;
import java.io.IOException;

public class M11_file_passing_file_to_file_mkdir {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) throws IOException{
		File f1 = new File("abc");
		f1.mkdir();
		File f2 = new File(f1,"test");
		f2.mkdir();
		System.out.println("done");
	}
}
