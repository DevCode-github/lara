class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class M extends A
{
	M()
	{
		System.out.println("M()");
	}
	M(int i)
	{
		System.out.println("M(int)");
	}
	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println("Hello World!");
		M m2 = new M(45);
	}
}
