package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;

public class M16_remove {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("abc");
		list1.add("xyx");
		list1.add("hello");
		list1.add("test");
		System.out.println(list1);
//		Object obj = list1.remove(Integer.valueOf(400));
		System.out.println(list1.remove("hello"));
		System.out.println(list1);
		
	}
}
