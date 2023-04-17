class T
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		do
		{
			int i = 100;
			System.out.println("do-while begin" + i);
			i++;
			System.out.println("do-while end" + i);
		}while (i <= 5);
		System.out.println("main end");
	}
}
