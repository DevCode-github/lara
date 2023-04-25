package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class M {
	int i,j;
	M(){}
	M(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
}
public class M38_comparator_aic {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new M(10, 28));
		list.add(new M(11, 27));
		list.add(new M(12, 26));
		list.add(new M(13, 25));
		list.add(new M(14, 24));
		list.add(new M(15, 23));
		list.add(new M(16, 22));
		list.add(new M(17, 21));
		list.add(new M(18, 20));
		System.out.println(list);
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((M)o1).i - ((M)o2).i;
			}
		});
		System.out.println(list);
		Collections.sort(list,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((M)o1).j - ((M)o2).j;
			}
		});
		System.out.println(list);
	}

}
