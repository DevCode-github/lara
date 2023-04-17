class A
{
	
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class L extends A
{
	L(int i)
	{
		super(10);
		System.out.println("L(int)");
	}
	public static void main(String[] args) 
	{
		L obj = new L(10);
		System.out.println("done");
	}
}
