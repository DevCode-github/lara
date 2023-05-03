package pack3_Set;

import java.util.Comparator;
import java.util.TreeSet;
class C{
	int i,j;
	C(int i,int j) {
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return "("+i+","+j+")";
	}
	public int hashCode() {
		return Integer.toString(i).hashCode() + Integer.toString(j).hashCode();
    }
	
	public boolean equals(Object o)
	{
		return this.i == ((C)o).i && this.j == ((C)o).j;
	}
}
@SuppressWarnings({"unchecked","rawtypes","serial"})
class TreeSet1 extends TreeSet{
	/*
	 * @Constructor : Adding our own constructor for object creation.
	 */
	TreeSet1(){
		super();
	}
	/*
	 * @ParametrizedConstructor : Adding our own argument constructor for object,
	 * creation with our own comparator.
	 */
	TreeSet1(Comparator comparator){
		super(comparator);
	}
	/*
	 * @addMany : Built on top of add() method, to more than one value at a time.
	 */
	public boolean addMany(Object ... o1) {
		boolean flag = false;
		for(Object o2 : o1) {
			if (flag == true) add(o2);
			else flag = add(o2);
		}
		return flag;
	}
}
public class M9_TreeSet_vararg_add {
	public static void main(String[] args) {
		TreeSet1 set = new TreeSet1((o1,o2) -> ((C)o1).i - ((C)o2).i);
		System.out.println(set.addMany(new C(2,3),new C(4,5),new C(5,6)));
		System.out.println(set.addMany(new C(2,3),new C(4,5),new C(5,6)));
		System.out.println(set.addMany(new C(2,3),new C(4,5),new C(5,6)));
		System.out.println(set);
	}

}
