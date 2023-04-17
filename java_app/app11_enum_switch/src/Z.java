class Z
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j;
		j = 10;
		switch(i)
		{
			case 5:
				System.out.println("from 5");
				break;
			case j:
				System.out.println("from 10");
				break;
		}
	}
}
