class R
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = 100;
		do
		{
			System.out.println("do-while begin" + i);
			i++;
			System.out.println("do-while end" + i);
		}while (i <= 5);
		System.out.println("main end");
	}
}
