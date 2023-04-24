package pack1;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class H{
	int i;
	int j;
	H(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
}
class Sort1 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return ((H)o1).i - ((H)o2).i;
	}
}
class Sort2 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return ((H)o1).j - ((H)o2).j;
	}
}
public class M35_comparator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
			list.add(new H(10,26));
			list.add(new H(11,25));
			list.add(new H(12,24));
			list.add(new H(13,23));
			list.add(new H(14,22));
			list.add(new H(15,21));
			list.add(new H(16,20));
			System.out.println(list);
			Collections.sort(list, new Sort1());
			System.out.println(list);
			Collections.sort(list,new Sort2());
			System.out.println(list);
	}
}
