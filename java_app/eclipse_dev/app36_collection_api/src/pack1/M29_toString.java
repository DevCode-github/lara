package pack1;
import java.util.ArrayList;
class A_1{
	int i;
	A_1(int i) {
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
		list.add(new A_1(90));
		list.add(new A_1(910));
		list.add(new A_1(190));
		list.add(new A_1(9));
		System.out.println(list);
		A_1 a1 = new A_1(90);
		System.out.println(a1);
	}
}