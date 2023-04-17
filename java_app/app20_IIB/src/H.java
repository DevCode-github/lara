class H 
{
	static int i;
	H()
	{
		i++;
	}
	H(int a)
	{
		i++;
	}
	H(int a, int b)
	{
		i++;
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		H h2 = new H(1);
		H h3 = new H(2,3);
		H h4 = new H();
		H h5 = new H(4,5);
		H h6 = new H();
		System.out.println(i);
	}
}
