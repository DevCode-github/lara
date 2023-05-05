package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;
import java.util.Collections;

public class M25_collections_sort_reverseorder {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add(100);
//		list.add(100);
		list.add("abc");
		list.add("abc");
		list.add("xyz");
		list.add("xyz");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
