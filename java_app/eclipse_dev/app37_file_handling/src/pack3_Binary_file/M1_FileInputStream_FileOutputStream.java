package pack3_Binary_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M1_FileInputStream_FileOutputStream {
	public static void main(String[] args) throws IOException{
		File f1 = new File("D:\\New folder (2)\\dev.png");
		File f2 = new File("D:\\dev.png");
		
		//opening input stream for reading bytes
		FileInputStream fin = new FileInputStream(f1);
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		//opening output stream for writing bytes
		FileOutputStream fout = new FileOutputStream(f2);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		//setting the size of the bucket of bytes to read, in this case the file size
		byte[] bytes = new byte[(int) f1.length()];
		bin.read(bytes);//reading
		bout.write(bytes);//writing
		
		//closing resources
		bout.flush();
		bout.close();
		fout.close();
		bin.close();
		fin.close();
		
		System.out.println("done");
	}
}
