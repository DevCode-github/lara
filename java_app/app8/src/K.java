class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("if block begin");
			if (false)
			{
				System.out.println("if2 block");
			}
			System.out.println("if block end");

		}
		else
		{
			System.out.println("else block");
			System.out.println("else block");
		}
		System.out.println("main end ");
		System.out.println(args.length);
	}
}r