class P 
{
	P(int i, int j)
	{
		this(9.5);
		System.out.println("P(int, int)");
	}
	P(int j)
	{
		this(3, 4);
		System.out.println("P(int)");
	}
	P(double j)
	{
		System.out.println("P(double)");
	}

	public static void main(String[] args) 
	{
		P p1 = new P(10, 20);
		System.out.println("-------------");
		P p2 = new P(10);
		System.out.println("-------------");
		P p3 = new P(3.4);
		System.out.println("-------------");
	}
}
