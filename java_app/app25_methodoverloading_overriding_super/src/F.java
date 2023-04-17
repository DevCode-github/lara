class A{
	static void test(){
		System.out.println("from A-test");
	}
}
class F extends A{
	void test(){
		System.out.println("from G-test");
	}
	public static void main(String[] args){
		F obj = new F();
		obj.test();
	}
}
