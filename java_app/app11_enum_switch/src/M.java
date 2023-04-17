class M
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		if(args.length == 0)
		{
			System.out.println("pls enter one int command line arg");
			return;
		}
		int i = Integer.parseInt(args[0]);
		switch (i)
		{
		case 1:
		case 3:
		case 5:
		case 6:
		case 8:
		case 2:
			{
				System.out.println("form case2" + i);
				break;
			}
		case 4:
			{
				System.out.println("from case4" + i);
				break;
			}
		case 7:
			{
				System.out.println("from case7" + i);
				break;
			}
		case 9:
			{
				System.out.println("from case9" + i);
				break;
			}
		default:
			{
				System.out.println("pls supply between 1 to 10 only");
				break;
			}
		}
		System.out.println("main end" + i);
	}
}
