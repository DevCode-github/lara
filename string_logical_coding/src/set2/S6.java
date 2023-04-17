class S6{
	public static void main(String[] args){
		String s1 = "ABC XYZ TEST HELLO";
		String s2 = "";
		for (int i = s1.lastIndexOf(' ',s1.lastIndexOf(' ')-1) ; i <= s1.lastIndexOf(' ') ; i++){
			s2 += s1.charAt(i);
		}
		System.out.println("Last second word " + s2.trim());
	}
}
