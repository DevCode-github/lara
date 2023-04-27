package pack1_ArrayList_sort_lambda_iterator;
interface N{
	void test();
}
public class M40_lambda_expression {
	public static void main(String[] args) {
		@SuppressWarnings({"unchecked","rawtypes"})
		N n1 = new N() {
			@Override
			public void test() {
				System.out.println("g-test lambda");				
			}
		};
		N n2 = () -> System.out.println("g-test lambda");
		n1.test();
		n2.test();
	}
}