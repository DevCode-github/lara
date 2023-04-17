class Z1{
	static void test(int ... i){
		System.out.println("from int var args:" + i.length);
	}
	public static void main(String[] args){
		test();
		test(20);
		test(20,40);
		test(20,40, 400);
		test(20,40, 60, 400);
	}
}
