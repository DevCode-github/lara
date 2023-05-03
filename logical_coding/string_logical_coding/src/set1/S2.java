class S2 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		System.out.println("Given string is " + s1);
		System.out.println("Given string is " + s1.length());
		int count = 0;
		for (int i = 0; i <= s1.length()-1 ; i++)
		{
			if(s1.charAt(i) != ' ')
				
			count++;
		}
		System.out.println("length of string : " + count);
		System.out.println("no of spaces : " + ((s1.length()) - count));
	}
}
