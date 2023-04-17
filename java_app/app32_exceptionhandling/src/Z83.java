class A{
	void test1() throws NullPointerException{}
	void test2() throws ClassNotFoundException{}
	void test3() throws InterruptedException{}
	void test4() throws Exception{}
	void test5() throws Throwable{}
	void test6(){}

}
class Z83 extends A{
	void test1() throws ClassNotFoundException{}
	void test2() throws ArithmeticException{}
	void test3() throws Exception{}
	void test4() throws ArithmeticException{}
	void test5() {}
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
