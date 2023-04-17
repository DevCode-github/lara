class R 
{
	int i;
	static R test()
	{
		return new R();
	}
	public static void main(String[] args) 
	{
		R r1 = test();
		System.out.println(r1.i);
	}
}
