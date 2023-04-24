package pack1;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
class K{
	int i;
	int j;
	String k;
	K(){}
	K(int i, int j, String k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String toString() {
		return "(" + i + ", " + j + ", " + k + ")";
	}
	static class Sort1 implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			return ((K)o1).i - ((K)o2).i;
		}
	}
	static class Sort2 implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			return ((K)o1).j - ((K)o2).j;
		}
	}
	static class Sort3 implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			return ((K)o1).k.compareTo(((K)o2).k);
		}
	}
}
public class M36_comparator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new K(10, 25, "xyz"));
		list.add(new K(15, 20, "abc"));
		list.add(new K(14, 21, "efg"));
		list.add(new K(13, 22, "ijk"));
		list.add(new K(12, 23, "mno"));
		list.add(new K(11, 24, "qpr"));
		System.out.println(list);
		Collections.sort(list, new K.Sort1());
		System.out.println(list);
		Collections.sort(list, new K.Sort2());
		System.out.println(list);
		Collections.sort(list, new K.Sort3());
		System.out.println(list);
	}
}
