package pack1;

import java.util.ArrayList;
import java.util.Collections;

class Q{
	int p,q;
	Q(int p, int q) {
		this.q = q;
		this.p = p;
	}
	public String toString() {
		return "(" + p + "," + q + ")";
	}
}
public class M43_lambda_comparator {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Q(10, 27));
		list.add(new Q(11, 26));
		list.add(new Q(12, 25));
		list.add(new Q(13, 24));
		list.add(new Q(14, 23));
		list.add(new Q(15, 22));
		list.add(new Q(16, 21));
		list.add(new Q(17, 20));
		System.out.println(list);
		Collections.sort(list, (o1, o2) -> ((Q)o1).p - ((Q)o2).p);
		System.out.println(list);
		Collections.sort(list, (o1, o2) -> ((Q)o1).q - ((Q)o2).q);
		System.out.println(list);
	}
}
