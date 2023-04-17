class A
{
	
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class J extends A
{
	J(int i)
	{
		super();
		System.out.println("J(int)");
	}
	public static void main(String[] args) 
	{
		J j1 = new J(10);
		System.out.println("Hello World!");
	}
}
