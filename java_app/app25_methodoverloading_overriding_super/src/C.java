class A{
	void test(){
		System.out.println("A-test()");
	}
}
class C extends A{
	int test(){
		System.out.println("C-test(int)");
		return 10;
	}
	public static void main(String[] args){
		C c1 = new C();
		c1.test();
		c1.test();
		System.out.println("done");
	}
}