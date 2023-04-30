package pack2_Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class M6_BufferedReader_arc {
	public static void main(String[] args) {
		try(FileReader fin = new FileReader("self.txt") ; BufferedReader bin = new BufferedReader(fin)) {
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
		System.out.println("done");
	}
}
