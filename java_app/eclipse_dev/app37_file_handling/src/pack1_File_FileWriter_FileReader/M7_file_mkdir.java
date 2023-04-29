package pack1_File_FileWriter_FileReader;

import java.io.File;

public class M7_file_mkdir {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		File f1 = new File("D:\\dir1");
		f1.mkdir();
		
		File f2 = new File("D:\\abc");
		f2.mkdir();
		
		File f3 = new File("D:\\xyz");
		f3.mkdir();
		
		System.out.println("done");
	}
}
