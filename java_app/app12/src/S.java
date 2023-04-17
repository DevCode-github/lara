class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		xyz:
		for (int i = 1;i <= 5;i++)
		{
			System.out.println("outer loop body begin : " + i);
			for (int j = 501; j<= 503 ; j++)
			{
				System.out.println("inner loop body begin: " + i + ", " + j);
				if (j == 502)
				{
					continue xyz;
				}
				System.out.println("inner loop body end : " + i + ", " + j);
			}
			System.out.println("outer loop body end : " + i);
		}
		System.out.println("main end");
	}
}
