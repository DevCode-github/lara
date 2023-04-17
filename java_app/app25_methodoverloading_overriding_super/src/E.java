class A{
	void test(){
		System.out.println("from A-test");
	}
}
class E extends A{
	int test(){
		System.out.println("from G-test");
		return 10;
	}
	public static void main(String[] args){
		E e1 = new E();
		e1.test();
	}
}
