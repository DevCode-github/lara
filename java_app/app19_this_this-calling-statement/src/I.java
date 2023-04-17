class I
{
	int a;
	I(int a)
	{
		a = 1000;
		this.a = 400;
	}
	public static void main(String[] args) 
	{
		I ref = new I(20);
		System.out.println(ref.a);
	}
}
