class C 
{
	C()
	{
		System.out.println("c()");
	}
	{
		System.out.println("C-IIB");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("------------");
		C c2 = new C();
	}
}


/*
IIB - Instance Intialization Block

1.For every instance creation IIB will be execute only once.
2.For every object creation IIB will be execute only once.

*/