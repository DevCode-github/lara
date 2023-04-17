class T
{
	static int i = test();
	static int test()
	{
		System.out.println("from test:" + i + ", " + j);
		return i + j + 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main: "+i + ", " + j);
		i = i + j + 20;
		j = i + j + 30;
		System.out.println("main: "+i + ", " + j);
	}
	static int j = test();
}
