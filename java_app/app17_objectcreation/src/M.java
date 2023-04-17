class M 
{
	int i;
	static void test()
	{
		System.out.println("from test");
		M m1 = new M();
		System.out.println("from test:" + m1.i);
		m1.i = 20;
		System.out.println("from test:" + m1.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end" + M.i);
	}
}
