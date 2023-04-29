package pack1_File_FileWriter_FileReader;

import java.io.File;

public class M12_file_mkdirs {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		File f1 = new File("a/b/c/hello");
		f1.mkdirs();
		System.out.println("done");
	}
}
