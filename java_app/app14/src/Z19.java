interface C
{
}
class Z19
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C r1 = test();
		System.out.println("main end" + r1);
	}
	public static C test() 
	{
		System.out.println("from test");
		return null;
	}

}

