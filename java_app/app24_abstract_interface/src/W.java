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
class W extends B{//multilevel inheritance
	void test3(){
		System.out.println("from test3");
	}
	public static void main(String[] args){
		W w1 = new W();
		w1.test1();
		w1.test2();
		w1.test3();
		System.out.println("done");
	}
}
//java not supporting multiple inheritance through the classes