class P
{
	static void test()
	{
		System.out.println("P-test");
	}
	static
	{
		System.out.println("P-sib");
	}
}
class Q
{
	static
	{
		System.out.println("Q-sib");
	}
	public static void main(String[] args) 
	{
		System.out.println("Q-main begin");
		P.test();
		System.out.println("-------------");
		P.test();
		System.out.println("Q-main end");
	}
}