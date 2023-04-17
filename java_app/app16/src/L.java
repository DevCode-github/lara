class N
{
	static void test()
	{
		System.out.println("N-test");
	}
}
class O
{
	public static void main(String[] args) 
	{
		System.out.println("O-main begin");
		N.test();
		System.out.println("O-main end");
	}
}
