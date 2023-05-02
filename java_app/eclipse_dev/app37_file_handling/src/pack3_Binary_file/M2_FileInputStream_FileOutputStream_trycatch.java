package pack3_Binary_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M2_FileInputStream_FileOutputStream_trycatch{
	public static void main(String[] args) throws IOException{
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			fin = new FileInputStream("D:\\New folder (2)\\dev.png");
			bin = new BufferedInputStream(fin);
			
			//opening output stream for writing bytes
			fout = new FileOutputStream("D:\\dev.png");
			bout = new BufferedOutputStream(fout);
			
			//setting the size of the bucket of bytes to read, in this case the file size
			byte[] b = new byte[(int) fin.available()];
			bin.read(b);//reading
			bout.write(b);//writing
			
			//closing resources
			bout.flush();
			bout.close();
			fout.close();
			bin.close();
			fin.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			//closing resources
			try {
				if (bout != null) bout.close();
			}
			catch(IOException ex) {
				System.out.println("resource closed");
			}
			try {
				if (bin != null) bin.close();
			}
			catch(IOException ex) {
				System.out.println("resource closed");
			}
			try {
				if (fout != null) fout.close();
			}
			catch(IOException ex) {
				System.out.println("resource closed");
			}
			try {
				if (fin != null) fin.close();
			}
			catch(IOException ex) {
				System.out.println("resource closed");
			}
		}
		
		System.out.println("done");
	}
}
