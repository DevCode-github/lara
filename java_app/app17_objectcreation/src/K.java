class K 
{
	int i;
	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.i = 10;
		System.out.println(k1.i);
		K k2 = new K();
		System.out.println(k2.i);
		k2.i = 30;
		System.out.println(k1.i);
		System.out.println(k2.i);
		k1.i = 300;
		System.out.println(k1.i);
		System.out.println(k2.i);
	}
}
