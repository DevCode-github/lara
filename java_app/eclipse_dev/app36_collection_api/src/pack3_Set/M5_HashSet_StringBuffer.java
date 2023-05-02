package pack3_Set;

import java.util.HashSet;

public class M5_HashSet_StringBuffer {
	@SuppressWarnings({ "unchecked", "rawtypes"})
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		/*
		 * hashCode() and equals() are not overrided
		 */
		System.out.println(set);
	}
}
