class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("if1");
			if (true)
			{
				if (true)
				{
					System.out.println("if3");
					System.out.println("if3 end");
				}
				else 
				{
					System.out.println("if3 is flase so else");
				}
			}
			else
			{
				System.out.println("if2 is false so else");
			}
			System.out.println("if1 end");
		}
		else
		{
			System.out.println("if1 is false so else");
			
		}
		System.out.println("main end");
	}
}
