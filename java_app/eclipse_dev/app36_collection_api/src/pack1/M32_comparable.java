package pack1;

import java.util.ArrayList;
import java.util.Collections;

class E implements Comparable{
	int i;
	E(int i) {
		this.i = i;
	}
	public String toString() {
		return ""+i;
	}
	public int compareTo(Object obj) {
		return i-((E)obj).i;
	}
}
public class M32_comparable {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new E(90));
		list.add(new E(910));
		list.add(new E(90));
		list.add(new E(10));
		list.add(new E(9));
		list.add(new E(98));
		list.add(new E(0));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
