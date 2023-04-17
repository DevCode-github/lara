interface A{
	void test1();
	void test2();
}
class Q implements A{
	public void test1(){
		System.out.println("from test1");
	}
	public void test2(){
		System.out.println("from test2");
	}
	public static void main(String[] args){
		Q q1 = new Q();
		q1.test1();
		q1.test2();
		System.out.println("done");
	}
}
