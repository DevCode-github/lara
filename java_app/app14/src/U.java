class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean i = test();
		System.out.println("main end");
	}
	public static int test() 
	{
		System.out.println("from test");
		return 10;
	}
}
