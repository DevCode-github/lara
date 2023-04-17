class G
{
	public static void main(String[] args)
	{
		int i = 10;
		System.out.println("main begin");
		if (true)
		{
			System.out.println("inside if");
			if (true)
			{
				System.out.println("inside if inside if");
			}
			System.out.println("at the end of if : " + i);
		}
		if (true)
		{

			System.out.println("inside 2nd nested if");
			if (true)
			{
				System.out.println("inside 2nd if inside if");
			}
			System.out.println("at the of 2nd nested if");
		}
		System.out.println("main end : " + i);
		System.out.println(23.34 != 'a');
	}
}