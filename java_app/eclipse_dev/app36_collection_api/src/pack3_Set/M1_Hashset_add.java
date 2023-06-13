package pack3_Set;

import java.util.HashSet;
import java.util.Set;

public class M1_Hashset_add {
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(121);
		set.add(120);
		set.add(122);
		set.add(125);
		set.add(123);
		set.add(124);
		set.add(122);
		set.add(120);
		set.add(126);
		set.add(24);
		set.add(122);
		set.add(126);
		set.add(12);
		set.add(121);
		set.add(121);
		/*
		 * -Avoids the duplicates.
		 * -Does not follow any order.
		 */
		System.out.println(set);
	}
}
