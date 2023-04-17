class Z11
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		float b1 = test();
		System.out.println("main end" + b1);
	}
	public static float test() 
	{
		System.out.println("from test");
		return 2.4F;
	}
}
