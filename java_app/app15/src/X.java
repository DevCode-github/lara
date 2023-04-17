class X
{
	static int i = test();
	static int test()
	{
		System.out.println("from test");
		return 100;
	}
	static
	{
		System.out.println("from SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
