class H
{
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		for (int i = 1; i <=5 ; i++)
		{
			System.out.println("outer loop body begin:" + i);
			for (int j = 501; j <= 503 ; j++)
			{
				System.out.println("inner loop body:" + i + ", " + j);
			}
			System.out.println("outer loop body end:" + i);
		}
		System.out.println("main end");
	}
}
