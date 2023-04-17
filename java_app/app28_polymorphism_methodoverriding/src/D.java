class A{
	static void test(){
		System.out.println("from A.test");
	}
	static{
		System.out.println("from A.SIB");
	}
}
class B extends A{
	static{
		System.out.println("from B.SIB");
	}
}
class M4{
	public static void main(String[] args){
		System.out.println("main begin");
		B.test();
		B b1 = new B();
		b1.test();
		System.out.println("main end");
	}
}
