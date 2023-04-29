package pack1_File_FileWriter;

import java.io.File;
import java.io.IOException;

public class M3_file_createNewFile_path {
	/**
	 * only works with single forward slash and double backward slash
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) throws IOException{
		File f1 = new File("D:/test1.txt");
//		File f1 = new File("D:\test1.txt");//error
		f1.createNewFile();
		
		File f2 = new File("D:/hello.html");
//		File f2 = new File("D:\hello.html");//error
		f2.createNewFile();
		
		File f3 = new File("D:/abc.doc");
		f3.createNewFile();
		
		System.out.println("done");
	}
}
