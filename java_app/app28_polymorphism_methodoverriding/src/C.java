class A{
	static void test(){
		System.out.println("from A.test");
	}
}
class B extends A{
	static void test(){
		System.out.println("from B.test");
	}
}
class M3{
	public static void main(String[] args){
		A a1 = new B();
		A a2 = new B();
		A[] elements = {(B) a1, (B) a2};
		for (A obj : elements){
			obj.test();// static methods are not involving in polymorphism
		}
		B b1 = new B();
		b1.test();
		System.out.println("Hello World!");
	}
}
