class H 
{
	H()
	{
		System.out.println("H()");
	}
	H(int i)
	{
		System.out.println("H(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1 = new H();
		System.out.println("----------");
		H h2 = new H(9);
		System.out.println("----------");
		H h3 = new H();
		System.out.println("----------");
		H h4 = new H(90);
		System.out.println("main end");
	}
}
