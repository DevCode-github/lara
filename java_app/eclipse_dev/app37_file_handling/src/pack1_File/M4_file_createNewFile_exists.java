package pack1_File;

import java.io.File;
import java.io.IOException;

public class M4_file_createNewFile_exists {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		File f1 = new File("src\\manager.java");//will only create file if previous given folders(src) exists, if given src\\temp\\manager.java will give error (shown in M5)
		System.out.println(1 + " : " + f1.exists());
		try {
			System.out.println(2 + " : " + f1.createNewFile());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(3 + " : " + f1.exists());
	}
}
