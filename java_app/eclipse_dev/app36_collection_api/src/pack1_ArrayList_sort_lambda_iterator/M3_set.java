package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;

public class M3_set {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(199);
		list.add(19.5);
		list.add("199");
		list.add("abc");
		list.add('t');
		System.out.println(list);
		System.out.println(list.set(2,"hello"));//replaces the element at the index and return the object.
		System.out.println(list);
	}
}
