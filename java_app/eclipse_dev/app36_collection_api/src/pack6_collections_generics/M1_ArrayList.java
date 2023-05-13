package pack6_collections_generics;

import java.util.ArrayList;

@SuppressWarnings({"unused","unchecked","rawtypes"})
public class M1_ArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(23);
		list.add(3.4);
		list.add(false);
		String s1 = (String)list.get(0);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("hello");
		list1.add("hello1");
		list1.add("hello2");
		list1.add("hello3");
		list1.add("hello4");
		String s2 = list1.get(0);
		System.out.println("done");
	}
}
