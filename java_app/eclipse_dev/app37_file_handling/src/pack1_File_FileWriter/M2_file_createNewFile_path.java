package pack1_File_FileWriter;

import java.io.File;
import java.io.IOException;

public class M2_file_createNewFile_path {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) throws IOException{
		File f1 = new File("D:\\test1.txt");
		f1.createNewFile();
		
		File f2 = new File("D:\\hello.html");
		f2.createNewFile();
		
		File f3 = new File("D:\\abc.doc");
		f3.createNewFile();
		
		System.out.println("done");
	}
}
