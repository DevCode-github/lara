class Q20 
{
	public static void main(String[] args) 
	{
		for (int i =1 ; i <= 6 ; i++ )
		{
			for (int j = 1 ; j <= 6 ; j++ )
			{
				if (i == 1 || j == 1 || i == 6 || j == 6 )
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(((8 - i - j) > 1 ? (8 - i - j) : 1 ) + " ");
				}
			}
			System.out.println();
		}
	}
}
