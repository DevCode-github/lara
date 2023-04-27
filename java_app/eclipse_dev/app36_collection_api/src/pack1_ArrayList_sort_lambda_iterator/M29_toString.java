package pack1_ArrayList_sort_lambda_iterator;
import java.util.ArrayList;
class A{
	int i;
	A(int i) {
		this.i = i;
	}
	/**
	 * @Object method toString is being overridden in @A which returns the value instead of just printing address.
	 */
	public  String toString() {
		return "" + i;
	}
}
public class M29_toString {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new A(90));
		list.add(new A(910));
		list.add(new A(190));
		list.add(new A(9));
		System.out.println(list);
		A a1 = new A(90);
		System.out.println(a1);
	}
}