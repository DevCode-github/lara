package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;
import java.util.Collections;

class D{
	int i;
	D(int i) {
		this.i = i;
	}
	public String toString() {
		return ""+i;
	}
}
public class M31_comparable {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new D(90));
		list.add(new D(910));
		list.add(new D(90));
		list.add(new D(10));
		list.add(new D(9));
		list.add(new D(98));
		list.add(new D(0));
		System.out.println(list);
		Collections.sort(list);
		System.err.println(list);
		
	}
}
