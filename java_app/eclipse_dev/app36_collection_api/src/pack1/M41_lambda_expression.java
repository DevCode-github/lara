package pack1;
interface O{
	int test();
}
public class M41_lambda_expression {
	public static void main(String[] args) {
		O o1 = () ->{
			System.out.println("g-test");
			System.out.println("g-test");
			System.out.println("g-test");
			return 0;
		};
		O o2 = () -> 100;
		O o3 = () -> {
			System.out.println("g-test");
			return 100;
		};
		System.out.println(o1.test());
		System.out.println(o2.test());
		System.out.println(o3.test());
	}
}
