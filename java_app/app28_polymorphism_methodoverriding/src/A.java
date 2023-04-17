class A{
	void test(){
		System.out.println("from A.test");
	}
}
class B extends A{
	void test(){
		System.out.println("from B.test");
	}
}
class M1{
	public static void main(String[] args){
		A a1 = new A();
		A a2 = new B();
		A[] elements = {a1, a2};
		for (A obj : elements){
			obj.test();// this behaviour is polymorphism 
		}
		System.out.println("Hello World!");
	}
}
