class P
{
	public static void main(String[] args) 
	{
		int i = 2147483647;
		System.out.println("loop body:" + i);
		while (i++ <= i++);
		{
			System.out.println("loop body:" + i);
		}
		System.out.println("main end:" + i);
	}
}
