class Z9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (args.length < 1)
		{
			System.out.println("pls supply one command line args");
			return;
		}
		double d1 = Math.sqrt(Integer.parseInt(args[0]));
		System.out.println("main end : "+ args[0] +" sqrt is " + d1);
	}
}
