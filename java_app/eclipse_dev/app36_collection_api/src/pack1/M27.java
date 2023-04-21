package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class M27 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(null);
		list.add(0);
		list.add(400);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
//		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
}
