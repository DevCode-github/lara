class E
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main begin");
		if(!true)
		{
			System.out.println("from if begin"); 
			i = i + 20;
			System.out.println("from if end :" + i);
		}
		System.out.println("main end : " + i);
	}
}
