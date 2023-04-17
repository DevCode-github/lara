class H 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test() 
	{
		System.out.println("from test");
		int i = 90;
		i++;
		System.out.println("from test end: " + i);
	}
}
