class D 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(145));
		System.out.println(Integer.toBinaryString(575));
		System.out.println(145 | 575);
		System.out.println(145 & 575);
		System.out.println(145 ^ 575);

	}
}
/*
145 = 10010001
575 = 1000111111


145 =  0010010001
575 =  1000111111
	  ----------
 |  => 1010111111 =>703

145 =  0010010001
575 =  1000111111
	  ----------
 &  => 0000010001 =>17

145 =  0010010001
575 =  1000111111
	  ----------
 ^  => 1010101110


*/