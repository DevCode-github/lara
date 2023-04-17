class E{
	static int test(short s1){
		return s1;
	}
	public static void main(String[] args){
		byte b1 = 100;
		long m1 = test(b1);
		System.out.println("done");
	}
}
