class Z2{
	static void test(int i, String ... varArgs){
		System.out.println("from test:" + i);
		System.out.println(varArgs.length);
		for (String s1 : varArgs){
			System.out.print(s1 + ", ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		test(90);
		System.out.println("-------------");
		test(90, "abc");
		System.out.println("-------------");
		test(90, "abc", "xyz", "hello", "test");
		System.out.println("-------------");
	}
}
