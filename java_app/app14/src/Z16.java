class A
{
}
class Z16
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A s1 = test();
		System.out.println("main end" + s1);
	}
	public static A test() 
	{
		System.out.println("from test");
		return new A();
	}

}

