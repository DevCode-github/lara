class P
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(P.i);
		P.i = 20;
		System.out.println(i);
		int i = 200;
		System.out.println(i);		
		System.out.println(P.i);
		i = 4000;
		P.i = 60;
		System.out.println(i);		
		System.out.println(P.i);
	}
}
