class S30{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		System.out.print("the diff b/n first and last space "+ (s1.indexOf(' ',s1.indexOf(' ')+1) - s1.indexOf(' ')));
	}
}
