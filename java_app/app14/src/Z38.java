class Z38
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100);
		System.out.println("main end");
	}
	public static void test(int i) 
	{
		int i = 90;
		System.out.println("from test:" + i);
	}
}
