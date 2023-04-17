class G
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i = 20;
		switch (i)
		{
		case 2:
			{
				System.out.println("form case2" + i);
				System.out.println("form case2");
				i++;
				break;
			}
		case 4:
			{
				System.out.println("from case4" + i);
				System.out.println("from case4");
				break;
			}
		case 5:
			{
				System.out.println("from case5" + i);
				System.out.println("from case5");
				break;
			}
		case 20:
			{
				System.out.println("from case25" + i);
				System.out.println("from case25");
				break;
			}

		}
		System.out.println("main end" + i);
	}
}
