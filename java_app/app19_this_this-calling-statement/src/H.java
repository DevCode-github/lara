class H
{
	int i;
	H()
	{
		i = 100; //this.i = 100
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println("main:" + h1.i);
	}
}
