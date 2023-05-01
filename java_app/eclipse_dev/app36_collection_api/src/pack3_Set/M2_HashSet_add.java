package pack3_Set;

import java.util.HashSet;

public class M2_HashSet_add {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println("addingstart @ 1: " + set.add(100));
		System.out.println("content @ 1: " + set);
		System.out.println("addingstart @ 2: " + set.add(100));
		System.out.println("content @ 2: " + set);
		System.out.println("addingstart @ 3: " + set.add(400));
		System.out.println("content @ 3: " + set);
		System.out.println("addingstart @ 4: " + set.add(400));
		System.out.println("content @ 4: " + set);
		System.out.println("addingstart @ 5: " + set.add(800));
		System.out.println("content @ 5: " + set);
		System.out.println("addingstart @ 6: " + set.add(800));
		System.out.println("content @ 6: " + set);
	}
}
