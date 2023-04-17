class F 
{
	static int i;
	F()
	{
		i += 10;
		System.out.println("constructor");
	}
	{
		i += 20;
		System.out.println("iib");
	}
	static
	{
		System.out.println("sib");
	}
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		F f1 = new F();
		System.out.println(F.i);
		System.out.println(f1.i);
		System.out.println(i);
		F f2 = new F();
		System.out.println(F.i);
		System.out.println(f2.i);
		System.out.println(f1.i);
		System.out.println(i);
	}
}
//While generating binary code compiler replaces reference variable with the class name for the satic attributes.


