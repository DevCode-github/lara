package pack1;

import java.util.ArrayList;

public class M6 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(199);
		list.add(19.5);
		list.add("xyz");
		list.add("abc");
		list.add('t');
		System.out.println(list);
		System.out.println(list.get(1));
	}
}