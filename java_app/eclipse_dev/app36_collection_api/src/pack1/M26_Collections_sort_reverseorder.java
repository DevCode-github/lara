package pack1;

import java.util.ArrayList;
import java.util.Collections;
/* Integer reversal */
public class M26_Collections_sort_reverseorder {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(200.0);//All element should be of same typeN
		list.add(0);
		list.add(400);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
}
