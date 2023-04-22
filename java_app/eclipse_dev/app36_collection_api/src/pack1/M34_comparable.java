package pack1;

import java.util.ArrayList;
import java.util.Collections;

class G implements Comparable{
	String i;
	G(String i) {
		this.i = i;
	}
	public String toString() {
		return "(" + i + ")";
	}
	public int compareTo(Object obj) {
		return i.compareTo(((G)obj).i);
	}
}
public class M34_comparable {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new G("xyz"));
		list.add(new G("mno"));
		list.add(new G("ijk"));
		list.add(new G("efg"));
		list.add(new G("abc"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
