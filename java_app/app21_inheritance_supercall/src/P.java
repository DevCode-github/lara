class A
{
	static
	{
		System.out.println("A-SIB");
	}
}
class P extends A
{
	static
	{
		System.out.println("P-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
	}
}
