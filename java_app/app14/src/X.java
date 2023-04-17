class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static int test() 
	{
		System.out.println("inside test ; xyz ");
		if (true)
		{
			return 10;
		}
		System.out.println("inside test ; abc ");
		return 10;
	}
}
