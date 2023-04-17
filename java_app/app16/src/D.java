class D 
{
	static int i;
	static
	{
		i = 10;//direct write
		System.out.println(i);//direct read

		D.i = 11;//indirect write
		System.out.println(D.i);//indirect read
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
