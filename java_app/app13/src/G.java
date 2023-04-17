class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i <= 5)
		{
			System.out.println("while loop body begin:" + i);
			if (i == 3)
			{
				i++;
				continue;
			}
			i++;
			System.out.println("while loop body end:" + i);

		}
		System.out.println("main end " + i);
	}
}
