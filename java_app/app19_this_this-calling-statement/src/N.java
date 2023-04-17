class N 
{
	N()
	{
		this(9);
		System.out.println("N()");
	}
	N(int i)
	{
		System.out.println("N(int)");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("------------");
		N n2 = new N(10);
		System.out.println("------------");
		N n3 = new N();
		System.out.println("------------");
		N n4 = new N(200);
		System.out.println("------------");
	}
}
