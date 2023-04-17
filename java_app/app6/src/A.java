class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("from if"); 
			int i = 10;
			System.out.println("from if end:" + i++);
			System.out.println("from if end:" + i);
			i++;
			System.out.println("from if end:" + i);
			i = i + 200;
			System.out.println("from if end:" + i);
		}
		System.out.println("main end");
	}
}
