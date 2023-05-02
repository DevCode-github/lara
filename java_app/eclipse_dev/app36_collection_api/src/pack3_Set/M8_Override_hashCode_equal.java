package pack3_Set;

import java.util.HashSet;

class B{
	int i;
	String s;
	B(int i, String s) {
		this.i = i;
		this.s = s;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + s + ")";
	}
	@Override
	public int hashCode() {
		/*
		 * since hashCode returns a unique number
		 * the addition of unique number will also 
		 * be unique.
		 */
		return Integer.hashCode(this.i) + this.s.hashCode();
	}
	@Override
	public boolean equals(Object o1) {
		return Integer.hashCode(this.i) == Integer.hashCode(((B)o1).i) && this.s.hashCode() == ((B)o1).s.hashCode();
	}	
}
public class M8_Override_hashCode_equal {
	@SuppressWarnings({ "unchecked", "rawtypes"})
	public static void main(String[] args) {
		//checking for the hashCode() method
		B b = new B(5,"zya");
		System.out.println(b.hashCode());
		
		HashSet set = new HashSet();
		set.add(new B(3,"abc"));
		set.add(new B(4,"efg"));
		set.add(new B(5,"ijk"));
		set.add(new B(6,"mno"));
		set.add(new B(6,"mno"));
		set.add(new B(5,"ijk"));
		set.add(new B(4,"efg"));
		set.add(new B(3,"abc"));
		System.out.println(set);
	}
}
