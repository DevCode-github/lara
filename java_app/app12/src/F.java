class F
{
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		for (int i = 1;i <= 1000;i *= 2)
		{
			System.out.println("loop body:" + i);
			System.out.println("--------------");
		}
		System.out.println("main end");
	}
}
