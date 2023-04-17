package pack1;
class E
{
	private E()
	{
		System.out.println("E()");
	}
	E(int i)
	{
		this();
		System.out.println("E(int)");
	}
}
class H extends E
{
	H()
	{
		super(90);
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1 = new H();
		System.out.println("main end");
	}
}
