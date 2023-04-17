class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if");
		}
		else
		{
			System.out.println("else begin");
			if (false)
			{
				System.out.println("if 2");
			}
			System.out.println("else end");
		}
		System.out.println("main end");
	}
}
