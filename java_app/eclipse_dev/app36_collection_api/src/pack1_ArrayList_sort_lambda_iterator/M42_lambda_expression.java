package pack1_ArrayList_sort_lambda_iterator;
interface P{
	void test(int i);
//	void test2(int k,int i);
}
public class M42_lambda_expression {
	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {
		P obj = (int i) -> System.out.println("obj-test");
		P obj1 = (i) -> System.out.println("obj1-test");
		P obj2 = (k) -> System.out.println("obj2-test");
		obj.test(0);
		obj1.test(10);
		obj2.test(20);
	}
}
