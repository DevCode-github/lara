class D{
	static void test(double i){
		System.out.println("test");
	}
	public static void main(String[] args){
		byte i = -128;
		int  j = 200;
		long k = 300;
		test(i);
		test(j);
		test(k);
		System.out.println("hello world");
	}
}
