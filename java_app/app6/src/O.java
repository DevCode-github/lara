class O
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i = 9;
		{
			System.out.println("from if block-stmt1");
			System.out.println("from if block-stmt2");
			System.out.println("from if block-stmt3");
		}
		{
			System.out.println("from if block-stmt1 " + i);			
			System.out.println("from if block-stmt2");
			System.out.println("from if block-stmt3");
		}
		System.out.println("main end : ");
	}
}
