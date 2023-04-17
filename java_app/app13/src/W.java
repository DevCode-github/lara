class W
{
	public static void main(String[] args)
	{
		int i = 1;
		System.out.println("main begin");
		do
		{
			System.out.println("do-while begin" + i);
			if (i == 3)
			{
				i++;
				break;
			}
			System.out.println("do-while end" + i);
			i++;
		}while (i <= 5);
		System.out.println("main end");
	}
}
