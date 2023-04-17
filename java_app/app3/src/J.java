class J 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = a-- + a-- + a-- + a-- + a-- + a-- + a-- + a-- + a;
		//		5(4)  4(3) 3(2)  2(1) 	1(0)  0(-1) -1(-2) -2(-3) -3
		System.out.println(a);//-3
		System.out.println(b);//9
	}
}
