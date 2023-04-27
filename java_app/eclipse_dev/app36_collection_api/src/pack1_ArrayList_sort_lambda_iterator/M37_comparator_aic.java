package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class L{
	int i,j;
	L(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
}
public class M37_comparator_aic {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new L(10, 28));
		list.add(new L(11, 27));
		list.add(new L(12, 26));
		list.add(new L(13, 25));
		list.add(new L(14, 24));
		list.add(new L(15, 23));
		list.add(new L(16, 22));
		list.add(new L(17, 21));
		list.add(new L(18, 20));
		System.out.println(list);
		Comparator c1 = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((L)o1).i - ((L)o2).i;
			}
		};
		Comparator c2 = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((L)o1).j - ((L)o2).j;
			}
		};
		Collections.sort(list,c1);
		System.out.println(list);
		Collections.sort(list,c2);
		System.out.println(list);
	}
}
