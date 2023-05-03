class S9{
	public static void main(String[] args){
		String s1 = "ABC XYZ TEST HELLO";
		String s2 = "";
		for (int i = s1.indexOf(' ',s1.indexOf(' ')+1) ; i <= s1.indexOf(' ',s1.indexOf(' ', s1.indexOf(' ')+1)+1) ; i++){
			s2 += s1.charAt(i);
		}
		System.out.println("third word length " + s2.trim().length());
	}
}
