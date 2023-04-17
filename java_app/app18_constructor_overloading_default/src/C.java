class C 
{
	C()
	{
		System.out.println("i am constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println("----------");
		C c2 = new C();
		System.out.println("----------");
		C c3 = new C();
		System.out.println("----------");
		System.out.println("main end");
	}
}
