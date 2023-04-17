class Z6 
{
	public static void main(String[] args) 
	{
		int i;
		for (i = 1, System.out.println("init:" + i);
			test(i);
			System.out.println("before:" + i), i++, System.out.println("after:" + i))

		{
			System.out.println("body:" + i);
		}
		System.out.println("main end:" + i);
	}
	static boolean test(int i)
	{
		boolean b1 = (i <= 5);
		System.out.println("boolean for " + i + " is " + b1);
		return b1;
	}
}
