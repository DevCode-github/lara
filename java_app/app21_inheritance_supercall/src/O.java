class A
{
	A()
	{
		System.out.println("A()");
	}
}
class O extends A
{
	O()
	{
		this(90, 21);
		System.out.println("O()");
	}
	O(int i)
	{
		this();
		System.out.println("O(int)");
	}
	O(int i, int j)
	{
		System.out.println("O(int)");
	}
	{
		System.out.println("O-IIB");
	}
	public static void main(String[] args) 
	{
		O o1 = new O();
		System.out.println("------------");
		O o2 = new O(90);
	}
}
