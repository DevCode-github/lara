class J
{
	J(int i, int j)
	{
		System.out.println("J(intn int)");
	}
	J(int i, double j)
	{
		System.out.println("I(int, double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		J j1 = new J(10, 20);
		System.out.println("----------");
		J j2 = new J(10, 3.4);
		System.out.println("main end");


	}
}
