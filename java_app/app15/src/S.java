class S
{
	static int test()
	{
		System.out.println("from test:" + i);
		return 200;
	}
	public static void main(String[] args) 
	{
		System.out.println("main: "+i);
		i = 20;
		System.out.println("main: "+i);
	}
	static int i = test();
}
