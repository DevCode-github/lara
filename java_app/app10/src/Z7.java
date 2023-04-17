class Z7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (args.length<1)
		{
			System.out.println("pls supply 2 command line args");
			return;
		}
		String s1 = args[0];
		System.out.println(s1);
		int i = Integer.parseInt(s1);
		int j = i + 20;
		System.out.println("main end : " + i + ", " + j);

	}
}
