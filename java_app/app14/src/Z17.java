class B
{
}
class Z17
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1 = test();
		System.out.println("main end" + b1);
	}
	public static B test() 
	{
		System.out.println("from test");
		return null;
	}

}

