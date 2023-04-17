class I 
{
	int a;
	public static void main(String[] args) 
	{
		I obj1 = new I();
		System.out.println(obj1.a);
		obj1.a = 10;
		I obj2 = obj1;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj2.a = 20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
