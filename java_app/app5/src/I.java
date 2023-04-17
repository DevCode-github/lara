class I
{
	public static void main(String[] args) 
	{
		int i = 1024;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.parseInt(Integer.toBinaryString(i),2));
	}
}
