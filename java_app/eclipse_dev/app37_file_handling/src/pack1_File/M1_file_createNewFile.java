package pack1_File;
import java.io.File;
import java.io.IOException;
public class M1_file_createNewFile {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) throws IOException{
		File f1 = new File("test1.txt");
		f1.createNewFile();
		
		File f2 = new File("hello.html");
		f2.createNewFile();
		
		File f3 = new File("abc.doc");
		f3.createNewFile();
		
		System.out.println("done");
	}
}
