package pack7_fail_fast_safe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class M2 {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
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
		Iterator<Integer> it = list.iterator();
		list.add(6);
		System.out.println(list);
		while(it.hasNext()) {
			System.out.println(it.next());
			if(it.hasNext()) list.add(20);
		}
		System.out.println(list);
	}
}
