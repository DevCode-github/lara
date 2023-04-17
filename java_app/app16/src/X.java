class Z1
{
	public static int i = 10;
	static
	{
		System.out.println("Z1-sib");
	}
	static int test()
	{
		System.out.println("from test");
		return 10;
	}
	public static int j = 10;
}
class Z
{
	static
	{
		System.out.println("Z-sib");
	}
	public static void main(String[] args) 
	{
		char ch='a';
		int i = ch;
		System.out.println(i);
		System.out.println(Z1.i);
		System.out.println(Z1.j);
		System.out.println(Z2.k);
		System.out.println("-------");
		System.out.println(Z2.k);
		System.out.println(Z1.i);
		System.out.println(Z1.j);
	}
}
class Z2
{
	static int k;
	static
	{
		System.out.println("Z2-sib");
	}
}
