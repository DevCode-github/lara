class L
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i = 5;
		switch (i)
		{
		case 1:
		case 3:
		case 5:
		case 6:
		case 8:
		case 14:
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
		default:
			{
				System.out.println("from default");
				break;
			}
		}
		System.out.println("main end" + i);
	}
}
