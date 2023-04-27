package pack1_File;

import java.io.File;

public class M6_file_mkdir {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		File f1 = new File("src\\dir1");
		f1.mkdir();
		
		File f2 = new File("src\\abc");
		f2.mkdir();
		
		File f3 = new File("src\\xyz");
		f3.mkdir();
		
		System.out.println("done");
	}
}
