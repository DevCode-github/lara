class Q 
{
	int i;

	static Q test()
	{
		Q q1 = new Q();
		q1.i = 90;
		System.out.println("from test:" + q1.i);
		return q1;
	}
	public static void main(String[] args) 
	{
		Q obj = test();
		System.out.println("main: " + obj.i);
	}
}
