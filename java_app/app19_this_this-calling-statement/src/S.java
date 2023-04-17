class S 
{
	S()
	{
		System.out.println("S()");
		this(9);
	}
	S(int i)
	{
		System.out.println("S(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
