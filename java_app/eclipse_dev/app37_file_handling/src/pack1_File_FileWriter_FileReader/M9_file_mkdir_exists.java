package pack1_File_FileWriter_FileReader;

import java.io.File;

public class M9_file_mkdir_exists {
	public static void main(String[] args) {
		File f1 = new File("F:\\dir");//does'nt throw error, return false if path does not exist
		System.err.println(f1.mkdir());
	}
}
