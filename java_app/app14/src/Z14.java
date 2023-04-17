class Z14
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char b1 = test();
		System.out.println("main end" + b1);
	}
	public static char test() 
	{
		System.out.println("from test");
		return 'a';
	}
}
