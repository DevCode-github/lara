class E 
{
	int i;
	void test()
	{
		System.out.println("test:" + i);
		i += 90;
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.i = 10;
		System.out.println("main1:" + e1.i);
		e1.test();
		System.out.println("main2:" + e1.i);
	}
}
