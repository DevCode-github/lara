package pack1;

import java.util.ArrayList;
public class M20 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("abc");
		list1.add("xyx");
		list1.add("hello");
		list1.add("test");
		list1.add("java");
		list1.add("btm");
		list1.add("html");
		list1.add("spring");
		list1.add("js");
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));
		}
	}
}
