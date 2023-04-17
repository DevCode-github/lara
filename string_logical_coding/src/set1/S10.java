class S10
{
	public static void main(String[] args) 
	{
		if (args[0].length() < 10)
		{
			System.out.println("length less than 10");
			return;
		}
		for (int i = 0; i <= 9 ; i++)
		{
			if(args[0].charAt(i) == ' '){
				continue;
			}
			System.out.println(args[0].charAt(i));
		}
	}
}
