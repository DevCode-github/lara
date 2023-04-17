class Y
{
	public static void main(String[] args)
	{
		int i = 1;
		System.out.println("main begin");
		do
		{
			System.out.println("do-while begin" + i);
			int j = 10;
			while (j <= 13)
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				if (j == 13)
				{
					j++;
					continue;
				}
				System.out.println("inner loop end:" + i + ", " + j);
				j++;
			}
			System.out.println("do-while end" + i);
			i++;
		}while (i <= 5);
		System.out.println("main end");
	}
}
