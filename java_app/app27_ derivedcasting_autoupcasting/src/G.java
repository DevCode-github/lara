class G{
	static void test1(A a1){
		System.out.println("form test1:");
	}
	public static void main(String[] args){
		B b1 = new B();
		D d1 = new D();
		test1(b1);//test1((A) b1);
		test1(d1);
		System.out.println("done");
	}
}
