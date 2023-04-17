class I
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i = 200;
		switch (i)
		{
		case 14:
			{
				System.out.println("form case2" + i);
				System.out.println("form case2");
				i++;
				break;
			}
		default:
			{
				System.out.println("from default");
				break;
			}
		case 4:
			{
				System.out.println("from case4" + i);
				System.out.println("from case4");
				break;
			}
		case 25:
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
