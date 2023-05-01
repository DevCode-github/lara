package pack3_Set;

import java.util.TreeSet;

public class M4_TreeSet {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(1000000000);
		set.add(103);
		set.add(101);
		set.add(102);
		set.add(100);
		set.add(100);
		set.add(103);
		set.add(102);
		set.add(101);
		set.add(100);
		/*
		 * -Avoids duplicates
		 * -Sorted order : ascending
		 */
		System.out.println(set);
	}
}
