package pack3_Set;

import java.util.HashSet;

class F{
	int i;
	int j;
	F(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
	@Override
	public int hashCode() {
		System.out.println("hascode is " + (Integer.hashCode(this.i) + Integer.hashCode(this.j)));
		return Integer.hashCode(this.i) + Integer.hashCode(this.j);
	}
	@Override
	public boolean equals(Object o) { 
		System.out.println("equals b/w (" + this.i + "," + this.j +") and (" + ((F)o).i + ", " + ((F)o).j + ")" + (this.i == ((F)o).i && this.j == ((F)o).j));
		return this.i == ((F)o).i && this.j == ((F)o).j;
	}
}
public class M11_HashSet_hashbucket {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		F f1 = new F(2,3);
		F f2 = new F(2,4);
		F f3 = new F(2,5);
		F f4 = new F(3,2);
		F f5 = new F(4,2);
		F f6 = new F(5,2);
		F f7 = new F(4,2);
		F f8 = new F(4,5);
		F f9 = new F(4,6);
		F f10 = new F(5,2);
		F f11 = new F(5,4);
		F f12 = new F(5,5);
		HashSet set = new HashSet() ;
		System.out.println("adding status is for f1 " + set.add(f1));
		System.out.println("adding status is for f2 " + set.add(f2));
		System.out.println("adding status is for f3 " + set.add(f3));
		System.out.println("adding status is for f4 " + set.add(f4));
		System.out.println("adding status is for f5 " + set.add(f5));
		System.out.println("adding status is for f6 " + set.add(f6));
		System.out.println("adding status is for f7 " + set.add(f7));
		System.out.println("adding status is for f8 " + set.add(f8));
		System.out.println("adding status is for f9 " + set.add(f9));
		System.out.println("adding status is for f10 " + set.add(f10));
		System.out.println("adding status is for f11 " + set.add(f11));
		System.out.println("adding status is for f12 " + set.add(f12));
		System.out.println(set);
		
	}
}
