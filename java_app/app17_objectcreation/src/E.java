class E 
{
	int i = 10;
	public static void main(String[] args) 
	{
		E e1 = new E();
		E e2 = e1;
		System.out.println(e1.i);
		System.out.println(e2.i);
	}
}
