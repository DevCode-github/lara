package pack7_fail_fast_safe;

import java.util.ArrayList;
import java.util.Iterator;

public class M1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(16);
		list.add(15);
		list.add(14);
		list.add(13);
		list.add(12);
		list.add(11);
		list.add(8);
		list.add(7);
		/*
		 * will throw ConcurrentModificationError
		 */
		Iterator<Integer> it = list.iterator();
		list.add(1);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
