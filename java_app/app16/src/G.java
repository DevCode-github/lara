class G 
{
	static int i;//illegal forword reference
	static int j = 10;
	static int test()
	{
		int i = 11;
		return i;
	}
	public static void main(String[] args) 
	{
		System.out.println(i + j + test());
	}
}
