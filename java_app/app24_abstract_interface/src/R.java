interface A{
	void test1();
}
interface B{
	void test2();
}
class R implements A, B{//perfect multiple inheritence
	public void test1(){
		System.out.println("from test1");
	}
	public void test2(){
		System.out.println("from test2");
	}
	public static void main(String[] args){
		R r1 = new R();
		r1.test1();
		r1.test2();
	}
}
