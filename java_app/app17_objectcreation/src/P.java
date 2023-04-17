class P
{
	int i;
	static void test(P obj)
	{
		System.out.println("from test:" + obj.i);
		obj.i = 800;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P();
		p1.i = 200;
		System.out.println("from main1:" + p1.i);
		test(p1);
		System.out.println("from main2:" + p1.i);
		System.out.println("main end");
	}
}
