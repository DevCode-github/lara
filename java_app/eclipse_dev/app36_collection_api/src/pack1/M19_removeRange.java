package pack1;

import java.util.ArrayList;

public class M19_removeRange extends ArrayList{
	public static void main(String[] args) {
		M19_removeRange list1 = new M19_removeRange();
		list1.add("abc");
		list1.add("xyx");
		list1.add("hello");
		list1.add("test");
		list1.add("java");
		list1.add("btm");
		list1.add("html");
		list1.add("spring");
		list1.add("js");
		System.out.println(list1);
		list1.removeRange(2,6);
		System.out.println(list1);
	}
}
