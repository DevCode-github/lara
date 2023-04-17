class E// E is super class
{
	static int i;
	static void test()
	{
		System.out.println("test");
	}
}
class F extends E
{
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		F.test();
	}
}
