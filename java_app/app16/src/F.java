class F
{
	static int i = F.j;
	static int j = 10;
	public static void main(String[] args) 
	{
		System.out.println(i + ", " + j);
	}
}
