package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class M24_collections_sort {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add(100);
//		list.add(100);
		list.add("abc");
		list.add("abc");
		list.add("xyz");
		list.add("xyz");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
