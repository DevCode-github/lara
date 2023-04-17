
class N 
{
	N()
	{
		System.out.println("N()");
	}
	{
		System.out.println("N-IIB");
	}
	static
	{
		System.out.println("N-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		N n1 = new N();
		System.out.println("main end");
	}
}
