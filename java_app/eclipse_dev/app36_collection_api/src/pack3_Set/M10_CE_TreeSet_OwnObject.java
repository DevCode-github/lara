package pack3_Set;

class D{
	int i;
	int j;
	D(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
	@Override
	public int hashCode() {
		return Integer.toString(this.i).hashCode() - Integer.toString(this.j).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof D && this.i == ((D)obj).i && this.j == ((D)obj).j; 
	}
}
public class M10_CE_TreeSet_OwnObject{
	public static void main(String[] args) {
		/*
		 * *CE -> class exercise.
		 * refer -> M9_TreeSet_vararg_add for addMany() and TreeSet1 definition.
		 * addMany() : Built on top of add(), to add many values at once.
		 * 
		 */
		TreeSet1 set = new TreeSet1((o1,o2) -> ((D)o1).j - ((D)o2).j);
		set.addMany(new D(5,10), new D(10,5),new D(6,9),new D(7,8), new D(8,7), new D(9,6), new D(10,5), new D(5,6), new D(5,6));
		System.out.println(set);
		/*
		 * @hashCode() : if we use addition operation in the method,
		 * then we will get the same hash code for all the objects, 
		 * Because of commutative property and since 10+5 = 9+6.
		 * 
		 */
		for(Object o: set) {
			System.out.println(((D)o).hashCode());
		}
	}
}
