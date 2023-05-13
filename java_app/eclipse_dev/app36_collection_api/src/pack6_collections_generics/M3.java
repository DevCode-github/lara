package pack6_collections_generics;

import java.util.ArrayList;
import java.util.Collections;

class A implements Comparable<A>{
	int i;
	A(int i){
		this.i = i;
	}
	public String toString() {
		return "" + i;
	}
	public int compareTo(A a1) {
		return i - a1.i;
	}
}
public class M3 {
	public static void main(String[] args) {
		ArrayList<A> list = new ArrayList<>();
		list.add(new A(20));
		list.add(new A(50));
		list.add(new A(60));
		list.add(new A(40));
		list.add(new A(30));
		list.add(new A(10));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
