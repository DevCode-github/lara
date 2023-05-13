package pack4_serialization;

import java.io.IOException;
import java.io.PrintStream;

public class M15_PrintStream {
//	public static final java.io.PrintStream out = null;
	public static void main(String[] args) throws IOException {
		PrintStream p1 = new PrintStream("test.log");
		p1.println(10);
		p1.println(10);
		p1.println(10);
		p1.println(10);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		
//		M15_PrintStream.out.println(77);
		
	}
}
