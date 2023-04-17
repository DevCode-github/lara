class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		w1:
		while (i <= 5)
		{
			System.out.println("while loop body begin:" + i);
			for (int j = 801; j <= 805 ; j++)
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				if (j == 803)
				{
					i++;
					break w1;
				}
				System.out.println("inner loop end:" + i + ", " + j);
			}
			System.out.println("while loop body end:" + i);
			i++;
		}
		System.out.println("main end " + i);
	}
}
