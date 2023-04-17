class H{
	static void test(byte b1){
		System.out.println("test");
	}
	public static void main(String[] args){
		double d1 = 4.0;
//		test(d1);
		test((byte)d1);
		System.out.println("done");
	}
}
