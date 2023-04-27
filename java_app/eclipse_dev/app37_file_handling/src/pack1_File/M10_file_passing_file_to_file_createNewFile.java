package pack1_File;

import java.io.File;
import java.io.IOException;

public class M10_file_passing_file_to_file_createNewFile {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) throws IOException{
		File f1 = new File("abc");
		f1.mkdir();
		File f2 = new File(f1,"test.txt");
		f2.createNewFile();
		System.out.println("done");
	}
}
