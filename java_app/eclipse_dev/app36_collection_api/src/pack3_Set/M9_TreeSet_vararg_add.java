package pack3_Set;

import java.util.Comparator;
import java.util.TreeSet;
class C{
	int i,j,k;
	C(int i,int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String toString() {
		return "("+i+","+j+","+k+")";
	}
	public int hashCode() {
		return Integer.toString(i).hashCode() - Integer.toString(j).hashCode() - Integer.toString(k).hashCode();
    }	
	public boolean equals(Object o)
	{
		return o instanceof C && this.i == ((C)o).i && this.j == ((C)o).j && this.k == ((C)o).k;
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
		/*
		 * Tree set is not using hashCode() and equal() method.
		 * Tree set is discarding object if compare method determines its field which we specified, as equal,
		 * so, made some changes in comparator.
		 */
		TreeSet1 set = new TreeSet1((o1,o2) -> {
			/*
			 * check whether the selected field, in this case i,
			 * is equal or not,
			 * if true : call hashCode() to check equality of the hash codes,
			 *           if true : call equal() to check equality,
			 *                     if true : return 0 | meaning they are same
			 *                     if false : go for next element, in this case j, check their equality
			 *                                if true : go for next, in this case k, k will not be equal since i and j are same,
			 *                                			and objects o1 and o2 are not equal.
			 *                                			return the difference of k.                                
			 *                                if false : return the difference of j.
			 *           if false : if false : go for next element, in this case j, check their equality
			 *                                if true : go for next, in this case k, k will not be equal since i and j are same,
			 *                                			and objects o1 and o2 are not equal.
			 *                                			return the difference of k.                                
			 *                                if false : return the difference of j.           
			 */
			if(((C)o1).i == ((C)o2).i) {
				if(((C)o1).hashCode() == ((C)o2).hashCode()) {
					if(((C)o1).equals(o2)) return 0;
					else return ((C)o1).j == ((C)o2).j ? ((C)o1).k - ((C)o2).k : ((C)o1).j - ((C)o2).j ;
				}
				else return ((C)o1).j == ((C)o2).j ? ((C)o1).k - ((C)o2).k : ((C)o1).j - ((C)o2).j ;
			}
			else return ((C)o1).i - ((C)o2).i;
		});
		System.out.println(set.addMany(new C(2,3,4),new C(4,5,6),new C(6,5,4)));
		System.out.println(set.addMany(new C(3,4,5),new C(4,5,6),new C(4,5,6),new C(6,6,6)));
		System.out.println(set.addMany(new C(2,2,5),new C(4,5,6),new C(6,5,4),new C(10,9,9)));
		System.out.println(set);
	}
}
