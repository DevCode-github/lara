class O 
{
	int i;
	static void test(O ref)
	{
		System.out.println("test-begin");
		System.out.println("from test: " + ref.i);
		System.out.println("test-end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O obj = new O();
		obj.i = 600;
		test(obj);
		System.out.println("main end");
	}
}
