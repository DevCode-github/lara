class C 
{
	int i;
	void test()
	{
		System.out.println("from test");
	}
}
class D extends C
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
		System.out.println(d1.i);
	}
}
