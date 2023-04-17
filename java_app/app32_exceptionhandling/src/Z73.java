class Z73{
	public static void main(String[] args){
		System.out.println("Hello World!");
		test3();
	}
	static void test1() throws InterruptedException{}
	static void test2() throws ClassNotFoundException{}
	static void test3() throws NullPointerException{}//ignored by compiler for unchecked
	static void test4(){}
}