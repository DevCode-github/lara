package pack3_Set;

import java.util.HashSet;

class A{
	int i;
	A(int i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return "" + i;
	}
}
public class M6_HashSet_Ownobject {
	@ SuppressWarnings({ "unchecked", "rawtypes"})
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add(90);
		set1.add(90);
		System.out.println(set1);

		HashSet set2 = new HashSet();
		set2.add("90");
		set2.add("90");
		System.out.println(set2);
		
		/*
		 * Since hashCode() and equals() method are not overrided it will have duplicates.
		 */
		HashSet set3 = new HashSet();
		set3.add(new A(90));
		set3.add(new A(90));
		System.out.println(set3);
	}
}
