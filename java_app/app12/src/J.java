class J
{
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		for (int i = 1;i <= 5;i++)
		{
			System.out.println("loop body begin : " + i);
			if (i <= 3)
			{
				System.out.println("from if:" + i);
				continue;
			}
			System.out.println("loop body end : " + i);
		}
		System.out.println("main end");
	}
}
