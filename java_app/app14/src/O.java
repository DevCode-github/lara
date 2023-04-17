class O 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (args.length == 0)
		{
			System.out.println("required one command line arg...");
			return;
		}
		String s1 = args[0];
		System.out.println("you supplied command line arg as:" + s1);
		System.out.println("main end");
	}
}
