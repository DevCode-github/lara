class Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		byte b1 = test();
		System.out.println("main end");
	}
	public static long test() 
	{
		System.out.println("from test");
		return 99999999;
	}
}
