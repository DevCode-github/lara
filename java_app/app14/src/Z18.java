class Z18
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Runnable r1 = test();
		System.out.println("main end" + r1);
	}
	public static Runnable test() 
	{
		System.out.println("from test");
		return null;
	}

}

