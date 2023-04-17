class L{
	public static void main(String[] args){
		int i = 500;
		short s1 = (short)i;
		short s2 = (byte)i;
		short s3 = (short)(byte)i;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
