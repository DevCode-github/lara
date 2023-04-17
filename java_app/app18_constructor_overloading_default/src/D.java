class D 
{
	int i;
	D()
	{
		i = 10;
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
		D d2 = new D();
		System.out.println(d2.i);
		D d3 = new D();
		System.out.println(d3.i);
	}
}
