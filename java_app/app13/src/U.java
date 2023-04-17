class U
{
	public static void main(String[] args) 
	{
		for (int i = 0; i<6 ; i++ )
		{
			for (int j = 5 ; j>=0 ; j-- )
			{
				if (i == 0 || i == 5 || j == 0 || j == 5)
				{
					System.out.print("0 ");						
				}
				else if ((j-i+1) <= 0)
				{
					System.out.print("1 ");
				}
				else 
				{
					System.out.print((j-i+1) + " ");
				}
			}
			System.out.println();
		}
	}
}