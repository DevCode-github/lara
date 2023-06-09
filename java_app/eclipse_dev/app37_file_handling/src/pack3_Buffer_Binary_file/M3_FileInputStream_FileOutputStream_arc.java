package pack3_Buffer_Binary_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class M3_FileInputStream_FileOutputStream_arc {
	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("D:\\New folder (2)\\dev.png") ; FileOutputStream fout = new FileOutputStream("D:\\dev.png") ; 
				BufferedInputStream bin = new BufferedInputStream(fin) ; BufferedOutputStream bout = new BufferedOutputStream(fout)) {
			//reading and writing
			/*
			 *  transferTo() - Reads all bytes from this input stream and writes the bytes to the given output stream.
			 *  available() - Return an estimate of the remaining bytes that can be read from the files
			 */
			bin.transferTo(bout);
			bout.write(new byte[(int) fin.available()]);		
			System.out.println("done");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
