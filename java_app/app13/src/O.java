class O
{
	public static void main(String[] args) 
	{
		int i = 1;
		while (i++ <= i++)
		{
			System.out.println("loop body:" + i);
		}
		System.out.println("main end:" + i);
	}
}
