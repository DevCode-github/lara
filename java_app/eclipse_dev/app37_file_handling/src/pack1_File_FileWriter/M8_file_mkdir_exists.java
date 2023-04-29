package pack1_File_FileWriter;

import java.io.File;

public class M8_file_mkdir_exists {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		File f1 = new File("images");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}
}
