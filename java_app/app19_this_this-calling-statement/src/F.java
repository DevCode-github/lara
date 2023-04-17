class F
{
	F()
	{
		System.out.println("constructor:" + this);
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("main:" + f1);
	}
}
