class V{
//	static void test(int i){
//		System.out.println("test(int)");
//	}
	static void test(Number i){
		System.out.println("test(Number)");
	}
	static void test(Object i){
		System.out.println("test(Object)");
	}
	static void test(byte ... i){
		System.out.println("test(var arg)");
	}
	public static void main(String[] args){
		byte b1 = 10;
		test(b1);
		System.out.println("Hello World!");
	}
}
