class Z28
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test1();
		System.out.println("main end:" + i);
	}
	public static int test1()
	{
		System.out.println("from test1");
		return test2() + test2();
	}
	public static int test2()
	{
		System.out.println("from test2");
		return 100;
	}

 }
