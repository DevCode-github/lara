class D 
{
	int i;
	void test()
	{
		System.out.println("test:" + this.i);
		this.i = this.i + 100;
	}
	public static void main(String[] args)
	{
		D d1 = new D();
		d1.i = 50;
		System.out.println("main1:" + d1.i);
		d1.test();
		System.out.println("main2:" + d1.i);
		D d2 = new D();
		d2.i =150;
		System.out.println("main3:" + d2.i);
		d2.test();
		System.out.println("main4:" + d2.i);
	}
}
