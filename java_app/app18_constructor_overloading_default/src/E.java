class E 
{
	int i;
	int j;
	E()
	{
		i = 10;
		j = 20;
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println(e1.i + ", " + e1.j);
		E e2 = new E();
		System.out.println(e2.i + ", " + e2.j);
		E e3 = new E();
		System.out.println(e3.i + ", " + e3.j);
	}
}
