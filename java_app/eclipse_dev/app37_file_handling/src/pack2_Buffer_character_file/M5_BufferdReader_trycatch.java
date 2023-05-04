package pack2_Buffer_character_file;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class M5_BufferdReader_trycatch {
	public static void main(String[] args) {
		FileReader fin = null;
		BufferedReader bin = null;
		try {
			fin = new FileReader("self.txt");
			bin = new BufferedReader(fin);
			String s1 = bin.readLine();
			while(s1 != null) {
				System.out.println(s1);
				s1 = bin.readLine();
			}
			bin.close();
			fin.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
				try {
					if (bin != null) bin.close();
				}
				catch(IOException ex) {
					System.out.println("already closed");
				}
				try {
					if (fin != null) fin.close();
				}
				catch(IOException ex) {
					System.out.println("already closed");
				}
		}
		System.out.println("done");
	}
}
