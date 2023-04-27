package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;
import java.util.Collections;

public class M28_Collections_sort_thread {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(190);
		list1.add(120);
		list1.add(40);
		list1.add(100);
		System.out.println(list1);
		Collections.sort(list1); 
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		list2.add("abc");
		list2.add("xyx");
		list2.add("test");
		list2.add("pqr");
		System.out.println(list2);
		Collections.sort(list2); 
		System.out.println(list2);
		
		/**
		 * @Thread does not implement comparable interface 
		 *  */
		ArrayList list3 = new ArrayList();
		list3.add(new Thread("abc"));
		list3.add(new Thread("xyx"));
		list3.add(new Thread("test"));
		list3.add(new Thread("pqr"));
		System.out.println(list3);
		Collections.sort(list3); 
		System.out.println(list3);
	}
}
