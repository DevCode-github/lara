class I
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = a++ + a++ + a++ + a++ + a++ + a++ + a++ + a;
		//		1		2	3		4	5		6	7		8
		System.out.println(a);//7
		System.out.println(b);//28
	}
}
