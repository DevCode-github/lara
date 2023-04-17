class N 
{
	int i;
	static void test1()
	{
		System.out.println("test1 begin");
		N n1 = new N();
		n1.i = 200;
		System.out.println("test1 end: " + n1.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}