class S15{
	public static void main(String[] args){
		String s1 = "ABC XYZ TEST HELLO";
		System.out.print("second word middle character " + (s1.indexOf(' ')+((s1.indexOf(' ',s1.indexOf(' ')+1)-s1.indexOf(' '))/2)));
	}
}
