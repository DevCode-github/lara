abstract class A
{
	abstract void test1();
	void test2(){
		System.out.println("from test");
	}
}
class C extends A
{
	void test1(){
		System.out.println("from test1");
	}
	public static void main(String[] args){
		C c1 = new C();
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
