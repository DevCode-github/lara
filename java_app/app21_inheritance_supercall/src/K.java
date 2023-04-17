class A
{
	
	A()
	{
		System.out.println("A()");
	}
}
class K extends A
{
	K(int i)
	{
		super();
		System.out.println("J(int)");
	}
	public static void main(String[] args) 
	{
		K j1 = new K(10);
		System.out.println("done");
	}
}
