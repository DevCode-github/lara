package pack3_Set;

import java.util.TreeSet;

class E{
	int i;
	int j;
	E(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
	@Override
	public int hashCode() {
		return Integer.hashCode(this.i) - Integer.hashCode(this.j);
	}
	@Override
	public boolean equals(Object o) {
		return this.i == ((E)o).i && this.j == ((E)o).j;
	}
}
public class M10_CE_Treeset {
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		TreeSet set = new TreeSet((o1,o2) -> ((E)o1).i - ((E)o2).i);
		set.add(new E(2,3));
		set.add(new E(2,4));
		set.add(new E(2,5));
		set.add(new E(2,5));
		set.add(new E(3,3));
		set.add(new E(3,4));
		set.add(new E(3,4));
		set.add(new E(3,5));
		set.add(new E(4,4));
		set.add(new E(4,4));
		set.add(new E(4,5));
		set.add(new E(4,5));
		set.add(new E(4,6));
		System.out.println(set);
	}
}
