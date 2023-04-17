class B
{
	static int i = test();
	static
	{
		i = 10;//direct write
		System.out.println(i);//direct read
	}
	static int test()
	{
		i = 10;//indirect write
		System.out.println(i);//indirect read
		return i;
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}