class C 
{
	static int i;
	static int j = i;//direct read
	static int k = C.i;//indirect read
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
