class W
{
	public static void main(String[] args) 
	{
		int i = 10;
		if((i++ == 10) || (i++ == 11)){
			System.out.println("if : " + i);
			i++;
		}
		System.out.println("main end: " + i);
	}
}
