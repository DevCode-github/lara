package pack1;
class A
{
	private void test()
	{
		System.out.println("from test");
	}
}
class J extends A
{
	public static void main(String[] args) 
	{
		J obj = new J();
		obj.test();
		System.out.println("done");
	}
}
