interface A{
	void test1();
}
interface B{
	void test2();
}
class C{
	void test(){
		System.out.println("from C-test");
	}
}
class S extends C implements A, B{//perfect multiple inheritence
	public void test1(){
		System.out.println("from test1");
	}
	public void test2(){
		System.out.println("from test2");
	}
	public static void main(String[] args){
		S s1 = new S();
		s1.test1();
		s1.test2();
		s1.test();
	}
}
