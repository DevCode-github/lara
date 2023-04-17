class E
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i = 2;
		switch (i)
		{
		case 2:
			{
				System.out.println("form case2" + i);
				System.out.println("form case2");
				i++;
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
			}
		}
		System.out.println("main end" + i);
	}
}
