class Z6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (args.length<2)
		{
			System.out.println("pls supply 2 command line args");
			return;
		}
		String s1 = args[0];
		System.out.println(s1);
		System.out.println("---------");
		String s2 = args[1];
		System.out.println(s2);
		System.out.println("---------");
		System.out.println("main end");

	}
}
