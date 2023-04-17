class Z3{
	static void test(String ... varArgs, int i){
		System.out.println("from test:" + i);
		System.out.println(varArgs.length);
		for (String s1 : varArgs){
			System.out.print(s1 + ", ");
		}
		System.out.println();
	}
}
