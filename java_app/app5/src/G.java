class G 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(376));
		System.out.println(376 >> 1);
		System.out.println(376 >> 2);
		System.out.println(376 >> 3);
		int i = 2;
		int j = ++i + i++ + i + i++ + --i + ++i + i + i + --i + ++i + i;
		System.out.println(i);
		System.out.println(j);
	}
}
/*
376		=>		101111000
>>1		=>		 10111100
>>2		=>		  1011110
>>3		=>		   101111
>>4		=>		    10111


*/
