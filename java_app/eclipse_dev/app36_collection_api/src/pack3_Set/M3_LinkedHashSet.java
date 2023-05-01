package pack3_Set;

import java.util.LinkedHashSet;

public class M3_LinkedHashSet {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(60);
		set.add(70);
		set.add(50);
		set.add(30);
		set.add(70);
		set.add(40);
		set.add(20);
		set.add(10);
		/*
		 * -Maintains the input order.
		 */
		System.out.println(set);
	}
}
