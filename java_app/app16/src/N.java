class R
{
	static int i = 90;
	static void test()
	{
		System.out.println("R-test");
	}
	static
	{
		System.out.println("R-sib");
	}
}
class S
{
	static
	{
		System.out.println("S-sib");
	}
	public static void main(String[] args) 
	{
		System.out.println("S-main begin");
		P.test();
		System.out.println("-------------");
		R.test();
		System.out.println(R.i);
		R.test();
		R.i = 9000;
		System.out.println(R.i);
		R.test();
		System.out.println("S-main end");
	}
}