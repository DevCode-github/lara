class S2{
	public static void main(String[] args){
		String s1 = "ABC XYZ TEST HELLO";
		String s2 = "";
		for (int i = 0 ; i <= s1.indexOf(' ') ; i++){
			s2 += s1.charAt(i);
		}
		System.out.println("First word " + s2.trim());
	}
}
