class Y 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		byte b1 = test();
		System.out.println("main end");
	}
	public static byte test() 
	{
		System.out.println("from test");
		return 100;
	}
}
