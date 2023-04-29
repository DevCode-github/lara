package pack1_File_FileWriter;

import java.io.File;
import java.io.IOException;

public class M5_file_createNewFile_path {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		System.err.println(1);
		File f1 = new File("src\\temp\\manager.java");//error since temp does not exist
		try {
			System.out.println("try begin");
			f1.createNewFile();
			System.out.println("try end");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(2);
	}
}
