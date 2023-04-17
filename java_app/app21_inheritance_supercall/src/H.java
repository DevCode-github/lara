class A
{
	A()
	{
		System.out.println("A()");
	}
}
class H extends A
{
	H()
	{
		super();//no argument call by compiler
		System.out.println("H()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1 = new H();
		System.out.println("main begin");
	}
}
