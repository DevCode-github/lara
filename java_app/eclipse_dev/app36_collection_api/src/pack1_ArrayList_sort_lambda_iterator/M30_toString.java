package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;

class C{
	int i;
	int j;
	C(int i, int j){
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return i+" "+j;
	}
}
public class M30_toString {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new C(90, 208));
		list.add(new C(910,280));
		list.add(new C(901,820));
		list.add(new C(109,2098));
		list.add(new C(9,8));
		list.add(new C(98,89));
		list.add(new C(0,0));
		System.out.println(list);
		
	}
}
