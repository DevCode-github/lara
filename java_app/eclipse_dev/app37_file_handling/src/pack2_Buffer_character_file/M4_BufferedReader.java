package pack2_Buffer_character_file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class M4_BufferedReader {
	public static void main(String[] args) throws IOException{
		File f1 = new File("self.txt");
		FileReader fin = new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();
		while(s1 != null) {
			System.out.println(s1);
			s1 = bin.readLine();
		}
		bin.close();
		fin.close();
	}
}
