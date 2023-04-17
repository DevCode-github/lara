package pack1;
class A
{
	private static void test()
	{
		System.out.println("form test");
	}
}
class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A.test();
		System.out.println("main end");
	}
}
