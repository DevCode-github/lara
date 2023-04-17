class Q
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(Q.i);
		Q.i = 20;
		System.out.println(i);
		System.out.println(i);		
		System.out.println(Q.i);
		i = 4000;
		Q.i = 60;
		System.out.println(i);		
		System.out.println(Q.i);
	}
}
