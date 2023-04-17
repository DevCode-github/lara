class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1;i <= 5;i++)
		{
			System.out.println("loop body begin : " + i);
			if (i ==1 )
			{
				continue;
				System.out.println("from if:" + i);
			}
			System.out.println("loop body end : " + i);
		}
		System.out.println("main end");
	}
}
