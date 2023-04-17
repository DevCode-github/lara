class A 
{
	void test()
	{
		System.out.println("test:" + this);
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("main: " + a1);
		a1.test();
		System.out.println("main end");
	}
}
// this is available in every non static definition block
//current object reference variable