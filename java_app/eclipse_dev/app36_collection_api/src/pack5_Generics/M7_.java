package pack5_Generics;

class G<Y>{
	/*
	 * cannot be applied for the static member.
	 */
//	static Y f1;
	Y field;
	Y field1;
	void test(Y obj) {
		System.out.println("from test : " + obj);
	}
}
public class M7_ {
	public static void main(String[] args) {
		G<String> obj = new G<String>();
		obj.field = "abc";
		obj.test("hello");
		
		G<Integer> obj1 = new G<Integer>();
		obj1.test(200);
		obj1.field = 500;
		
		G obj3 = new G();
		obj3.field = 33;
		
		G obj4 = new G();
		obj4.field = "abc";
	
		/*
		 * Only for derived data types.
		 */
//		G<int> obj5 = new G<int>();
		
		System.out.println("done " + obj3.field.getClass().getName());
		System.out.println("done " + obj4.field.getClass().getName());
		System.out.println("done " + obj3.field1);
	}

}
