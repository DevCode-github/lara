class A{
	void test1(){
		System.out.println("from test1");
	}
}
class B extends A{
	void test2(){
		System.out.println("from test2");
	}
}
class C extends A{
	void test4(){
		System.out.println("from test4");
	}
}
class X extends A{//hierarchial inheritance
	void test3(){
		System.out.println("from test3");
	}
	public static void main(String[] args){
		X x1 = new X();
		x1.test1();
		x1.test3();
		System.out.println("done");
	}
}
//java not supporting multiple inheritance through the classes