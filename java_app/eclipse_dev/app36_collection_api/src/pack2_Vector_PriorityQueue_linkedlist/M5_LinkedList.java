package pack2_Vector_PriorityQueue_linkedlist;

import java.util.Collections;
import java.util.LinkedList;

@SuppressWarnings({"unchecked","rawtypes"})
public class M5_LinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(44);
		list.add(list.size(), 55);
		list.add(list.size()-1, 56);
		list.add(list.size(),null);
//		list.set(1, "eee");j
		System.out.println(list.removeLast());
		System.out.println(list); 
		Collections.sort(list);
		System.out.println(list.remove(2));
		System.out.println(list);
		
	}
}
