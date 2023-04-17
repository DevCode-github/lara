interface A{
	void test1();
}
interface B{
	void test2();
}
interface C extends A,B{//multiple inheritance
	void test3();
}
class V implements C{
	public void test1(){
		System.out.println("from V-test1");
	}
	public void test2(){
		System.out.println("from V-test2");
	}
	public void test3(){
		System.out.println("from V-test3");
	}
	public static void main(String[] args){
		V v1 = new V();
		v1.test1();
		v1.test2();
		v1.test3();
		System.out.println("done");
	}
}
//java supports multiple inheritance through interfaces.