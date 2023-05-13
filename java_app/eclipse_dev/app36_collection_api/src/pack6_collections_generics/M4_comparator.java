package pack6_collections_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class B implements Comparable<B>{
	int i;
	B(int i){
		this.i = i;
	}
	public String toString() {
		return "" + i;
	}
	public int compareTo(B a1) {
		return i - a1.i;
	}
}
class sort implements Comparator<B>{
	public int compare(B b1, B b2) {
		return b1.i - b2.i;
	}
}
public class M4_comparator {
	public static void main(String[] args) {
		ArrayList<B> list = new ArrayList<>();
		list.add(new B(90));
		list.add(new B(96));
		list.add(new B(95));
		list.add(new B(94));
		list.add(new B(93));
		list.add(new B(92));
		list.add(new B(91));
		System.out.println(list);
//		Collections.sort(list,new sort());
  		Collections.sort(list, (b1,b2) -> b1.i-b2.i);
		System.out.println(list);
	}
}
