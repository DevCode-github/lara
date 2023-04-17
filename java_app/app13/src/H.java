class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i <= 5)
		{
			System.out.println("while loop body begin:" + i);
			for (int j = 801; j <= 805 ; j++)
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				System.out.println("inner loop begin:" + i + ", " + j);
			}
			System.out.println("while loop body end:" + i);
			i++;
		}
		System.out.println("main end " + i);
	}
}
