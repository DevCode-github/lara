class N
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
		case 7:
		case 9:
		{
			System.out.println("odd " + i);
			break;
		}
		case 2:
		case 4:
		case 8:
		case 6:
		case 10:
			{
				System.out.println("even" + i);
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
