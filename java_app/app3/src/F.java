class F
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i++ + i + i++ + i;
		//      1     2    2    3
		System.out.println(i);//3
		System.out.println(j);//8
	}
}
