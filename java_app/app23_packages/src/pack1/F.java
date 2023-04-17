package pack1;
class E
{
	private E()
	{
		System.out.println("E()");
	}
}
class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		E e1 = new E();
		System.out.println("main end");
	}
}
