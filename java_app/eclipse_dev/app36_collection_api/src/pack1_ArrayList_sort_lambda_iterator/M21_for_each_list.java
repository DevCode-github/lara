package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;

public class M21_for_each_list {
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
		for(Object obj : list1) {
			System.out.println(obj);
			
		}
	}
}
