abstract class A
{
	abstract void test1();
	abstract void test2();
	void test3(){
		System.out.println("from test");
	}
}
abstract class B extends A{
	void test2(){
		System.out.println("from test");
	}
}
class D extends B
{
	void test1(){
		System.out.println("from test1");
	}
	public static void main(String[] args){
		D d1 = new D();
		d1.test1();
		d1.test2();
		System.out.println("done");
	}
}
