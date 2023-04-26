package pack1;

import java.util.ArrayList;

public class M23_avoid_duplicates {
	public static boolean addNew(Object obj, ArrayList list) {
		if (!list.contains(obj)) {
			list.add(obj);
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(100);
		list.add("abc");
		list.add("abc");
		list.add("xyz");
		list.add("xyz");
		System.out.println(list);
		addNew(100,list);
		addNew("abc",list);
		addNew("xyz",list);
		addNew("pqr",list);
		System.out.println(list);
	}
}
