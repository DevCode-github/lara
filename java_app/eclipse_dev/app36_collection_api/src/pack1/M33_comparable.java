package pack1;

import java.util.ArrayList;
import java.util.Collections;

class F implements Comparable{
	int i;
	int j;
	F(int i, int j) {
		 this.i = i;
		 this.j = j;
	}
	public String toString() {
		return "("+i+", "+j+")";
	}
	public int compareTo(Object obj) {
		return i-((F)obj).i;
	}
}
public class M33_comparable {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new F(90, 208));
		list.add(new F(910,280));
		list.add(new F(901,820));
		list.add(new F(109,2098));
		list.add(new F(9,8));
		list.add(new F(98,89));
		list.add(new F(0,0));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
