package pack1_File_FileWriter_FileReader;

import java.io.File;

public class M13_file_isFile_isDirectory {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		File f1 = new File("abc");
		File f2 = new File("test.txt");
		System.out.println(f1.isFile());//returns true only if file exists or is a file. 
		System.out.println(f1.isDirectory());//return true only if directory exists or is a directory. 
		System.out.println(f2.isFile());
		System.out.println(f2.isDirectory());
		
	}
}
