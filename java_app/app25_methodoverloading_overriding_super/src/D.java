class A{
	void test(){
		System.out.println("from A-test");
	}
}
class D extends A{
	void test(){
		System.out.println("from G-test");
	}
	public static void main(String[] args){
		D d1 = new D();
		d1.test();
	}
}
