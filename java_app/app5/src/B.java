class B 
{
	public static void main(String[] args) 
	{
		int i = 456;
		System.out.println(Integer.toBinaryString(i));
	}
}
/*
111001000
456/2 = 228 + r0
228/2 = 114 + r0
114/2 = 57 + r0
57/2 = 28 + r1
28/2 = 14 + r0
14/2 = 7 + r0
7/2 = 3 + r1
3/2 = 1 + r1
1/2 = 0 + r1
*/
