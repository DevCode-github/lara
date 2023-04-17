class L 
{
	int i;
	public static void main(String[] args) 
	{
		L obj1 = new L();
		System.out.println(obj1.i);
		L obj2 = obj1;
		System.out.println(obj2.i);
		L obj3 = new L();
		System.out.println(obj3.i);
		obj1.i = 200;
		obj3.i = 400;
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		System.out.println(obj3.i);
	}
}
