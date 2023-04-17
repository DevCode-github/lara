class O
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(a);
		a = 20;
		System.out.println(a);
		int a = 200;
		System.out.println(a);		
		System.out.println(O.a);
		a = 4000;
		O.a = 60;
		System.out.println(a);		
		System.out.println(O.a);
	}
}
